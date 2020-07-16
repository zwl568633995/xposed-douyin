package com.wujieshuju.huidou.p031ui.fragment.home;

import android.app.ProgressDialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.wujieshuju.huidou.C1068R;
import com.wujieshuju.huidou.Const;
import com.wujieshuju.huidou.model.DyUser;
import com.wujieshuju.huidou.network.BaseResponse;
import com.wujieshuju.huidou.network.OkHttpClientUtil;
import com.wujieshuju.huidou.p031ui.base.BaseFragment;
import com.wujieshuju.huidou.util.ConfigUtil;
import com.wujieshuju.huidou.util.ProgressUtil;
import java.util.HashMap;

/* renamed from: com.wujieshuju.huidou.ui.fragment.home.HomeFragment */
public class HomeFragment extends BaseFragment {
    private DyUser dyUser;
    private Button mBtnBind;
    private ImageView mIvHead;
    private View mRlContent;
    private View mRlEmpty;
    private TextView mTvDisplayName;
    private TextView mTvNickname;

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.fragment_home;
    }

    /* access modifiers changed from: protected */
    public void initData() {
    }

    /* access modifiers changed from: protected */
    public void initView() {
        this.mRlEmpty = findViewById(C1068R.C1071id.rl_empty);
        this.mRlContent = findViewById(C1068R.C1071id.rl_content);
        this.mIvHead = (ImageView) findViewById(C1068R.C1071id.iv_head);
        this.mTvNickname = (TextView) findViewById(C1068R.C1071id.tv_nickname);
        this.mTvDisplayName = (TextView) findViewById(C1068R.C1071id.tv_display_id);
        this.mBtnBind = (Button) findViewById(C1068R.C1071id.btn_bind);
    }

    /* access modifiers changed from: protected */
    public void initListener() {
        this.mBtnBind.setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    public void setupView() {
        int i;
        Context context;
        DyUser currentDyInfo = ConfigUtil.getInstance().getCurrentDyInfo();
        this.dyUser = currentDyInfo;
        if (TextUtils.isEmpty(currentDyInfo.uid)) {
            this.mRlEmpty.setVisibility(0);
            this.mRlContent.setVisibility(8);
        } else {
            this.mRlEmpty.setVisibility(8);
            this.mRlContent.setVisibility(0);
            this.mTvNickname.setText(this.dyUser.nickname);
            this.mTvDisplayName.setText(this.dyUser.uniqueId);
            this.mBtnBind.setText(this.dyUser.isBind ? "解绑" : "绑定");
            ImageLoader.getInstance().displayImage(this.dyUser.avatar, this.mIvHead);
        }
        Button button = this.mBtnBind;
        if (this.dyUser.isBind) {
            context = getContext();
            i = C1068R.C1070drawable.shape_view_unbind;
        } else {
            context = getContext();
            i = C1068R.C1070drawable.shape_view_yellow;
        }
        button.setBackground(context.getDrawable(i));
    }

    public void onClick(View view) {
        if (view.getId() == C1068R.C1071id.btn_bind) {
            bindOrUnbind();
        }
    }

    private void bindOrUnbind() {
        final DyUser currentDyInfo = ConfigUtil.getInstance().getCurrentDyInfo();
        if (!TextUtils.isEmpty(currentDyInfo.uid)) {
            final ProgressDialog createProgressDialog = ProgressUtil.createProgressDialog(getActivity(), currentDyInfo.isBind ? "正在解绑" : "正在绑定");
            createProgressDialog.show();
            HashMap hashMap = new HashMap();
            hashMap.put("assistantId", currentDyInfo.uid);
            hashMap.put("unique_id", currentDyInfo.uniqueId);
            hashMap.put("sec_uid", currentDyInfo.secUid);
            hashMap.put("nickname", currentDyInfo.nickname);
            hashMap.put("avatar", currentDyInfo.avatar);
            hashMap.put(NotificationCompat.CATEGORY_STATUS, currentDyInfo.isBind ? "30" : "10");
            OkHttpClientUtil.getInstance().post(Const.URL_BIND_ASSISTANT, hashMap, BaseResponse.class, new OkHttpClientUtil.ResponseCallback() {
                public <T extends BaseResponse> void onComplete(T t) {
                    createProgressDialog.dismiss();
                    Toast.makeText(HomeFragment.this.getContext(), t.msg, 0).show();
                    if (t.status == 1) {
                        ConfigUtil.getInstance().bindDy(true ^ currentDyInfo.isBind);
                        HomeFragment.this.setupView();
                    }
                }
            });
        }
    }
}
