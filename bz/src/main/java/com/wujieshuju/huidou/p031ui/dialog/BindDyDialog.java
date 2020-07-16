package com.wujieshuju.huidou.p031ui.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.wujieshuju.huidou.C1068R;
import com.wujieshuju.huidou.Const;
import com.wujieshuju.huidou.HDApp;
import com.wujieshuju.huidou.model.DashboardResponse;
import com.wujieshuju.huidou.network.BaseResponse;
import com.wujieshuju.huidou.network.OkHttpClientUtil;
import com.wujieshuju.huidou.p031ui.dialog.BindDyDialog;
import com.wujieshuju.huidou.room.model.DyHistory;
import com.wujieshuju.huidou.room.p030db.DyHistoryDB;
import com.wujieshuju.huidou.threadpool.ThreadPool;
import com.wujieshuju.huidou.threadpool.UiJob;
import com.wujieshuju.huidou.util.ConfigUtil;
import com.wujieshuju.huidou.util.ProgressUtil;
import com.wujieshuju.huidou.util.UIHelper;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.wujieshuju.huidou.ui.dialog.BindDyDialog */
public class BindDyDialog extends Dialog implements View.OnClickListener {
    /* access modifiers changed from: private */
    public HistoryRecyclerAdapter mAdapter;
    private Context mContext;
    /* access modifiers changed from: private */
    public EditText mEtDyId;
    /* access modifiers changed from: private */
    public List<DyHistory> mHistoryList;
    /* access modifiers changed from: private */
    public View mRlTollBar;
    private View mRootView;
    /* access modifiers changed from: private */
    public RecyclerView mRvHistory;

    /* renamed from: com.wujieshuju.huidou.ui.dialog.BindDyDialog$OnHistoryItemClickListener */
    public interface OnHistoryItemClickListener {
        void onHistoryItemClick(DyHistory dyHistory);
    }

    public BindDyDialog(Context context) {
        this(context, 0);
    }

    public BindDyDialog(Context context, int i) {
        super(context, i);
        this.mContext = context;
        initView();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        initData();
        setupView();
    }

    private void initView() {
        this.mRootView = getLayoutInflater().inflate(C1068R.layout.dialog_bind_dy, (ViewGroup) null);
        setContentView(this.mRootView, new LinearLayout.LayoutParams(-1, -2));
        this.mRootView.setSystemUiVisibility(4866);
        int dip2px = UIHelper.dip2px(getContext(), 10.0f);
        View findViewById = this.mRootView.findViewById(C1068R.C1071id.rl_tool_bar);
        this.mRlTollBar = findViewById;
        findViewById.setPadding(dip2px, UIHelper.getStatusBarHeight(getContext()), dip2px, dip2px);
        this.mEtDyId = (EditText) this.mRootView.findViewById(C1068R.C1071id.et_dy_id);
        this.mRvHistory = (RecyclerView) this.mRootView.findViewById(C1068R.C1071id.rv_history);
        findViewById(C1068R.C1071id.tv_bind).setOnClickListener(this);
        this.mRlTollBar.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                BindDyDialog.this.mRlTollBar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                BindDyDialog.this.mRvHistory.getLayoutParams().width = BindDyDialog.this.mEtDyId.getWidth();
                BindDyDialog.this.mRvHistory.requestLayout();
            }
        });
    }

    private void initData() {
        ThreadPool.getDefault().submit(new UiJob<List<DyHistory>>() {
            /* access modifiers changed from: protected */
            public List<DyHistory> doInBackground() {
                return DyHistoryDB.getInstance(BindDyDialog.this.getContext()).getDyHistoryDao().getAllHistory();
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(List<DyHistory> list) {
                List unused = BindDyDialog.this.mHistoryList = list;
                if (BindDyDialog.this.mAdapter != null) {
                    BindDyDialog.this.mAdapter.update(BindDyDialog.this.mHistoryList);
                }
            }
        });
    }

    private void setupView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        this.mRvHistory.setLayoutManager(linearLayoutManager);
        HistoryRecyclerAdapter historyRecyclerAdapter = new HistoryRecyclerAdapter(this.mHistoryList, new OnHistoryItemClickListener() {
            public final void onHistoryItemClick(DyHistory dyHistory) {
                BindDyDialog.this.lambda$setupView$0$BindDyDialog(dyHistory);
            }
        });
        this.mAdapter = historyRecyclerAdapter;
        this.mRvHistory.setAdapter(historyRecyclerAdapter);
    }

    public /* synthetic */ void lambda$setupView$0$BindDyDialog(DyHistory dyHistory) {
        this.mEtDyId.setText(dyHistory.getName());
        this.mEtDyId.setSelection(dyHistory.getName().length());
    }

    public void dismiss() {
        super.dismiss();
        this.mAdapter = null;
    }

    public void onClick(View view) {
        if (view.getId() == C1068R.C1071id.tv_bind) {
            bind();
        }
    }

    private void bind() {
        final String trim = this.mEtDyId.getText().toString().trim();
        final DashboardResponse.data hDConfig = ConfigUtil.getInstance().getHDConfig();
        if (hDConfig == null || hDConfig.assistantBindDouyin == null) {
            Toast.makeText(getContext(), "配置信息为空", 0).show();
        } else if (!ConfigUtil.getInstance().getCurrentDyInfo().isBind) {
            Toast.makeText(getContext(), "请先绑定机器人", 0).show();
        } else {
            final ProgressDialog createProgressDialog = ProgressUtil.createProgressDialog(this.mContext, TextUtils.isEmpty(trim) ? "正在解绑" : "正在绑定");
            createProgressDialog.show();
            HashMap hashMap = new HashMap();
            hashMap.put("id", String.valueOf(hDConfig.assistantBindDouyin.f986id));
            hashMap.put("assistantId", ConfigUtil.getInstance().getCurrentDyInfo().uid);
            hashMap.put("douyinId", trim);
            OkHttpClientUtil.getInstance().post(Const.URL_BIND_ASSISTANT_DOUYING, hashMap, BaseResponse.class, new OkHttpClientUtil.ResponseCallback() {
                public <T extends BaseResponse> void onComplete(T t) {
                    createProgressDialog.dismiss();
                    int i = 0;
                    Toast.makeText(BindDyDialog.this.getContext(), t.msg, 0).show();
                    if (t.status == 1) {
                        hDConfig.assistantBindDouyin.msg = trim;
                        DashboardResponse.assistantBindDouyin assistantbinddouyin = hDConfig.assistantBindDouyin;
                        if (!TextUtils.isEmpty(trim)) {
                            i = 10;
                        }
                        assistantbinddouyin.status = i;
                        ConfigUtil.getInstance().updateHDConfig();
                        BindDyDialog.this.saveHistory(trim);
                        BindDyDialog.this.dismiss();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void saveHistory(String str) {
        if (!TextUtils.isEmpty(str)) {
            ThreadPool.getDefault().submit(new ThreadPool.Job(str) {
                private final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final Object run(ThreadPool.JobContext jobContext) {
                    return BindDyDialog.this.lambda$saveHistory$1$BindDyDialog(this.f$1, jobContext);
                }
            });
        }
    }

    public /* synthetic */ Void lambda$saveHistory$1$BindDyDialog(String str, ThreadPool.JobContext jobContext) {
        DyHistory dyHistory = new DyHistory();
        dyHistory.setName(str);
        int indexOf = this.mHistoryList.indexOf(dyHistory);
        if (indexOf >= 0) {
            DyHistoryDB.getInstance(getContext()).getDyHistoryDao().delete(this.mHistoryList.get(indexOf));
        }
        DyHistoryDB.getInstance(getContext()).getDyHistoryDao().insert(dyHistory);
        return null;
    }

    /* renamed from: com.wujieshuju.huidou.ui.dialog.BindDyDialog$HistoryRecyclerAdapter */
    private static class HistoryRecyclerAdapter extends RecyclerView.Adapter<HistoryViewHolder> {
        private List<DyHistory> mDatas;
        private OnHistoryItemClickListener mListener;

        public HistoryRecyclerAdapter(List<DyHistory> list, OnHistoryItemClickListener onHistoryItemClickListener) {
            this.mDatas = list;
            this.mListener = onHistoryItemClickListener;
        }

        public void update(List<DyHistory> list) {
            this.mDatas = list;
            notifyDataSetChanged();
        }

        public HistoryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new HistoryViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1068R.layout.item_dy_history, viewGroup, false));
        }

        public void onBindViewHolder(HistoryViewHolder historyViewHolder, int i) {
            DyHistory dyHistory = this.mDatas.get(i);
            historyViewHolder.mTvDyId.setText(dyHistory.getName());
            historyViewHolder.mTvDyId.setOnClickListener(new View.OnClickListener(dyHistory) {
                private final /* synthetic */ DyHistory f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    BindDyDialog.HistoryRecyclerAdapter.this.lambda$onBindViewHolder$0$BindDyDialog$HistoryRecyclerAdapter(this.f$1, view);
                }
            });
            historyViewHolder.mIvDeleteHistory.setOnClickListener(new View.OnClickListener(dyHistory) {
                private final /* synthetic */ DyHistory f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    BindDyDialog.HistoryRecyclerAdapter.this.lambda$onBindViewHolder$2$BindDyDialog$HistoryRecyclerAdapter(this.f$1, view);
                }
            });
        }

        public /* synthetic */ void lambda$onBindViewHolder$0$BindDyDialog$HistoryRecyclerAdapter(DyHistory dyHistory, View view) {
            OnHistoryItemClickListener onHistoryItemClickListener = this.mListener;
            if (onHistoryItemClickListener != null) {
                onHistoryItemClickListener.onHistoryItemClick(dyHistory);
            }
        }

        public /* synthetic */ void lambda$onBindViewHolder$2$BindDyDialog$HistoryRecyclerAdapter(DyHistory dyHistory, View view) {
            ThreadPool.getDefault().submit(new ThreadPool.Job() {
                public final Object run(ThreadPool.JobContext jobContext) {
                    return DyHistoryDB.getInstance(HDApp.getApp().getApplicationContext()).getDyHistoryDao().delete(DyHistory.this);
                }
            });
            this.mDatas.remove(dyHistory);
            notifyDataSetChanged();
        }

        public int getItemCount() {
            List<DyHistory> list = this.mDatas;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* renamed from: com.wujieshuju.huidou.ui.dialog.BindDyDialog$HistoryViewHolder */
    private static class HistoryViewHolder extends RecyclerView.ViewHolder {
        public ImageView mIvDeleteHistory;
        public TextView mTvDyId;

        public HistoryViewHolder(View view) {
            super(view);
            this.mTvDyId = (TextView) view.findViewById(C1068R.C1071id.tv_history_dy_id);
            this.mIvDeleteHistory = (ImageView) view.findViewById(C1068R.C1071id.iv_delete_history);
        }
    }
}
