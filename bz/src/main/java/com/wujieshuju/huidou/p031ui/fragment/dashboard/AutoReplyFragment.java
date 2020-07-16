package com.wujieshuju.huidou.p031ui.fragment.dashboard;

import android.app.ProgressDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.library.flowlayout.FlowLayoutManager;
import com.wujieshuju.huidou.C1068R;
import com.wujieshuju.huidou.Const;
import com.wujieshuju.huidou.model.DashboardResponse;
import com.wujieshuju.huidou.network.BaseResponse;
import com.wujieshuju.huidou.network.OkHttpClientUtil;
import com.wujieshuju.huidou.p031ui.base.BaseFragment;
import com.wujieshuju.huidou.p031ui.fragment.dashboard.AutoReplyFragment;
import com.wujieshuju.huidou.util.ConfigUtil;
import com.wujieshuju.huidou.util.JsonUtil;
import com.wujieshuju.huidou.util.ProgressUtil;
import com.wujieshuju.huidou.util.ToastUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.wujieshuju.huidou.ui.fragment.dashboard.AutoReplyFragment */
public class AutoReplyFragment extends BaseFragment {
    private Button addKeyWordButton;
    private EditText editTextKey;
    private EditText editTextValue;
    private ReplyRecyclerViewAdapter mAdapter;
    private List<DashboardResponse.ReplyKeyword> mDatas;
    private EditText mEtKey;
    private EditText mEtValue;
    private RecyclerView mRlReply;
    /* access modifiers changed from: private */
    public DashboardResponse.stReplyKeyword stReplyKeyword;
    private TextView tvSave;

    /* renamed from: com.wujieshuju.huidou.ui.fragment.dashboard.AutoReplyFragment$OnReplyKeyWordClickListener */
    public interface OnReplyKeyWordClickListener {
        void onClick(DashboardResponse.ReplyKeyword replyKeyword);
    }

    /* access modifiers changed from: protected */
    public String getActionBarTitle() {
        return "自动回复";
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.fragment_auto_reply;
    }

    /* access modifiers changed from: protected */
    public void initView() {
        setActionBar(C1068R.layout.actionbar_confirm_button);
        this.mRlReply = (RecyclerView) findViewById(C1068R.C1071id.rl_reply);
        this.addKeyWordButton = (Button) findViewById(C1068R.C1071id.addKeyWordButton);
        this.tvSave = (TextView) getActionBarView(C1068R.C1071id.tv_save);
    }

    /* access modifiers changed from: protected */
    public void initListener() {
        this.addKeyWordButton.setOnClickListener(this);
        getActionBarView(C1068R.C1071id.tv_save).setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    public void initData() {
        if (ConfigUtil.getInstance().getCurrentDyInfo().uid != null) {
            if (ConfigUtil.getInstance().getHDConfig() == null) {
                Toast.makeText(getContext(), "配置数据错误，重新进入当前页面", 0).show();
                return;
            }
            DashboardResponse.stReplyKeyword streplykeyword = ConfigUtil.getInstance().getHDConfig().stReplyKeyword;
            this.stReplyKeyword = streplykeyword;
            List<DashboardResponse.ReplyKeyword> list = (List) JsonUtil.parseJson(streplykeyword.content, DashboardResponse.ReplyKeywordList.class);
            this.mDatas = list;
            if (list == null) {
                this.mDatas = new ArrayList();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setupView() {
        this.mEtKey = (EditText) findViewById(C1068R.C1071id.editTextKey);
        this.mEtValue = (EditText) findViewById(C1068R.C1071id.editTextValue);
        this.mRlReply.setLayoutManager(new FlowLayoutManager() {
            public boolean canScrollVertically() {
                return false;
            }
        });
        ReplyRecyclerViewAdapter replyRecyclerViewAdapter = new ReplyRecyclerViewAdapter(this.mDatas, new OnReplyKeyWordClickListener() {
            public final void onClick(DashboardResponse.ReplyKeyword replyKeyword) {
                AutoReplyFragment.this.lambda$setupView$0$AutoReplyFragment(replyKeyword);
            }
        });
        this.mAdapter = replyRecyclerViewAdapter;
        this.mRlReply.setAdapter(replyRecyclerViewAdapter);
    }

    public /* synthetic */ void lambda$setupView$0$AutoReplyFragment(DashboardResponse.ReplyKeyword replyKeyword) {
        this.mEtKey.setText(replyKeyword.key);
        this.mEtValue.setText(replyKeyword.value);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C1068R.C1071id.addKeyWordButton) {
            DashboardResponse.ReplyKeyword replyKeyword = new DashboardResponse.ReplyKeyword();
            replyKeyword.key = ((EditText) findViewById(C1068R.C1071id.editTextKey)).getText().toString().trim();
            replyKeyword.value = ((EditText) findViewById(C1068R.C1071id.editTextValue)).getText().toString().trim();
            this.mDatas.add(replyKeyword);
            this.mAdapter.notifyDataSetChanged();
        } else if (id == C1068R.C1071id.tv_save) {
            Save();
        }
    }

    private void Save() {
        if (!ConfigUtil.getInstance().getCurrentDyInfo().isBind) {
            ToastUtil.makeText("未绑定抖音号");
            return;
        }
        final ProgressDialog createProgressDialog = ProgressUtil.createProgressDialog(getContext(), "保存中");
        createProgressDialog.show();
        final String serialObject = JsonUtil.serialObject(this.mDatas);
        HashMap hashMap = new HashMap();
        hashMap.put("id", String.valueOf(this.stReplyKeyword.f986id));
        hashMap.put("assistant_uid", ConfigUtil.getInstance().getCurrentDyInfo().uid);
        hashMap.put("content", serialObject);
        OkHttpClientUtil.getInstance().post(Const.URL_MODIFY_KEY_WORD_REPLY, hashMap, BaseResponse.class, new OkHttpClientUtil.ResponseCallback() {
            public <T extends BaseResponse> void onComplete(T t) {
                createProgressDialog.dismiss();
                Toast.makeText(AutoReplyFragment.this.getContext(), t.msg, 0).show();
                if (t.status == 1) {
                    AutoReplyFragment.this.stReplyKeyword.content = serialObject;
                    ConfigUtil.getInstance().updateHDConfig();
                }
            }
        });
    }

    /* renamed from: com.wujieshuju.huidou.ui.fragment.dashboard.AutoReplyFragment$ReplyRecyclerViewAdapter */
    public static class ReplyRecyclerViewAdapter extends RecyclerView.Adapter<ReplyViewHolder> {
        private DashboardResponse.ReplyKeyword mCurrReplyKeyword;
        private List<DashboardResponse.ReplyKeyword> mDatas;
        private OnReplyKeyWordClickListener mListener;

        public ReplyRecyclerViewAdapter(List<DashboardResponse.ReplyKeyword> list, OnReplyKeyWordClickListener onReplyKeyWordClickListener) {
            this.mDatas = list;
            this.mListener = onReplyKeyWordClickListener;
        }

        public ReplyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ReplyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1068R.layout.layout_auto_reply_item, viewGroup, false));
        }

        public void onBindViewHolder(ReplyViewHolder replyViewHolder, int i) {
            DashboardResponse.ReplyKeyword replyKeyword = this.mDatas.get(i);
            replyViewHolder.mTvKey.setText(replyKeyword.key);
            replyViewHolder.mTvKey.setSelected(this.mCurrReplyKeyword == replyKeyword);
            replyViewHolder.mTvKey.setOnClickListener(new View.OnClickListener(replyKeyword) {
                private final /* synthetic */ DashboardResponse.ReplyKeyword f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    AutoReplyFragment.ReplyRecyclerViewAdapter.this.mo13291x770b9c48(this.f$1, view);
                }
            });
            replyViewHolder.mIvDelete.setOnClickListener(new View.OnClickListener(i) {
                private final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    AutoReplyFragment.ReplyRecyclerViewAdapter.this.mo13292x39f805a7(this.f$1, view);
                }
            });
        }

        /* renamed from: lambda$onBindViewHolder$0$AutoReplyFragment$ReplyRecyclerViewAdapter */
        public /* synthetic */ void mo13291x770b9c48(DashboardResponse.ReplyKeyword replyKeyword, View view) {
            this.mCurrReplyKeyword = replyKeyword;
            notifyDataSetChanged();
            OnReplyKeyWordClickListener onReplyKeyWordClickListener = this.mListener;
            if (onReplyKeyWordClickListener != null) {
                onReplyKeyWordClickListener.onClick(replyKeyword);
            }
        }

        /* renamed from: lambda$onBindViewHolder$1$AutoReplyFragment$ReplyRecyclerViewAdapter */
        public /* synthetic */ void mo13292x39f805a7(int i, View view) {
            this.mDatas.remove(i);
            notifyDataSetChanged();
        }

        public int getItemCount() {
            List<DashboardResponse.ReplyKeyword> list = this.mDatas;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* renamed from: com.wujieshuju.huidou.ui.fragment.dashboard.AutoReplyFragment$ReplyViewHolder */
    public static class ReplyViewHolder extends RecyclerView.ViewHolder {
        public View mIvDelete;
        public TextView mTvKey;

        public ReplyViewHolder(View view) {
            super(view);
            this.mTvKey = (TextView) view.findViewById(C1068R.C1071id.tv_key);
            this.mIvDelete = view.findViewById(C1068R.C1071id.iv_delete);
        }
    }
}
