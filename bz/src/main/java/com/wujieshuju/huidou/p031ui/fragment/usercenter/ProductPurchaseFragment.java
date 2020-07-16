package com.wujieshuju.huidou.p031ui.fragment.usercenter;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.wujieshuju.huidou.C1068R;
import com.wujieshuju.huidou.Const;
import com.wujieshuju.huidou.model.CreateOrderResponse;
import com.wujieshuju.huidou.model.ProductInfoResponse;
import com.wujieshuju.huidou.model.UserInfoResponse;
import com.wujieshuju.huidou.network.BaseResponse;
import com.wujieshuju.huidou.network.OkHttpClientUtil;
import com.wujieshuju.huidou.p031ui.base.BaseFragment;
import com.wujieshuju.huidou.util.ConfigUtil;
import com.wujieshuju.huidou.util.ProgressUtil;
import com.wujieshuju.huidou.util.ToastUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.wujieshuju.huidou.ui.fragment.usercenter.ProductPurchaseFragment */
public class ProductPurchaseFragment extends BaseFragment {
    private TextView buyNowTextView;
    /* access modifiers changed from: private */
    public CreateOrderResponse.DATA createOrderResponseData;
    /* access modifiers changed from: private */
    public Dialog dialog;
    /* access modifiers changed from: private */
    public ProductInfoResponse.Item huidouProductInfo;
    /* access modifiers changed from: private */
    public TextView priceTextView;

    /* access modifiers changed from: protected */
    public String getActionBarTitle() {
        return "产品购买";
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.fragment_product_purchase;
    }

    /* access modifiers changed from: protected */
    public void setupView() {
    }

    /* access modifiers changed from: protected */
    public void initView() {
        this.priceTextView = (TextView) findViewById(C1068R.C1071id.priceTextView);
        this.buyNowTextView = (TextView) findViewById(C1068R.C1071id.buyNowTextView);
    }

    /* access modifiers changed from: protected */
    public void initListener() {
        this.buyNowTextView.setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    public void initData() {
        OkHttpClientUtil.getInstance().post(Const.URL_GET_PRODUCT_MSG, (Map<String, String>) null, ProductInfoResponse.class, new OkHttpClientUtil.ResponseCallback() {
            public <T extends BaseResponse> void onComplete(T t) {
                if (t.status != 1) {
                    Toast.makeText(ProductPurchaseFragment.this.getContext(), t.msg, 0).show();
                    return;
                }
                Iterator it = ((ArrayList) t.data).iterator();
                while (it.hasNext()) {
                    ProductInfoResponse.Item item = (ProductInfoResponse.Item) it.next();
                    if (item.sequence == 4) {
                        ProductInfoResponse.Item unused = ProductPurchaseFragment.this.huidouProductInfo = new ProductInfoResponse.Item();
                        ProductInfoResponse.Item unused2 = ProductPurchaseFragment.this.huidouProductInfo = item;
                        ProductPurchaseFragment.this.priceTextView.setText(String.valueOf((int) Float.parseFloat(item.price)));
                    }
                }
            }
        });
    }

    public void onClick(View view) {
        if (view != this.buyNowTextView) {
            return;
        }
        if (this.huidouProductInfo == null) {
            Toast.makeText(getContext(), "价格方案为空", 0).show();
            return;
        }
        final ProgressDialog createProgressDialog = ProgressUtil.createProgressDialog(getContext(), "正在获取支付二维码");
        createProgressDialog.show();
        HashMap hashMap = new HashMap();
        hashMap.put("product_id", String.valueOf(this.huidouProductInfo.sequence));
        hashMap.put("price_id", String.valueOf(this.huidouProductInfo.scheme_id));
        OkHttpClientUtil.getInstance().post(Const.URL_CREATE_ORDER, hashMap, CreateOrderResponse.class, new OkHttpClientUtil.ResponseCallback() {
            public <T extends BaseResponse> void onComplete(T t) {
                createProgressDialog.dismiss();
                if (t.data == null) {
                    ToastUtil.makeText("返回数据为空");
                    return;
                }
                CreateOrderResponse.DATA unused = ProductPurchaseFragment.this.createOrderResponseData = (CreateOrderResponse.DATA) t.data;
                Log.i(Const.TAG, "CodePay - >" + ProductPurchaseFragment.this.createOrderResponseData.price);
                Dialog unused2 = ProductPurchaseFragment.this.dialog = new Dialog(ProductPurchaseFragment.this.getContext());
                ProductPurchaseFragment.this.dialog.setContentView(C1068R.layout.dialog_alipay_qrcode);
                ImageLoader.getInstance().displayImage(ProductPurchaseFragment.this.createOrderResponseData.qr_code, (ImageView) ProductPurchaseFragment.this.dialog.findViewById(C1068R.C1071id.imgAliPayQRCode));
                ((TextView) ProductPurchaseFragment.this.dialog.findViewById(C1068R.C1071id.payAmountTextView)).setText("￥" + ProductPurchaseFragment.this.createOrderResponseData.price);
                ProductPurchaseFragment.this.dialog.show();
                ProductPurchaseFragment.this.CheckPayStatus();
            }
        });
    }

    public void CheckPayStatus() {
        Dialog dialog2 = this.dialog;
        if (dialog2 == null || dialog2.isShowing()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            final TextView textView = (TextView) this.dialog.findViewById(C1068R.C1071id.payTipsTextView);
            HashMap hashMap = new HashMap();
            hashMap.put("order_no", this.createOrderResponseData.order_no);
            OkHttpClientUtil.getInstance().post(Const.URL_QUERY_PAY_STATUS, hashMap, BaseResponse.class, new OkHttpClientUtil.ResponseCallback() {
                /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
                /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public <T extends com.wujieshuju.huidou.network.BaseResponse> void onComplete(T r7) {
                    /*
                        r6 = this;
                        java.lang.String r0 = r7.msg
                        int r1 = r0.hashCode()
                        r2 = -1686543982(0xffffffff9b796192, float:-2.0628324E-22)
                        r3 = 0
                        r4 = 2
                        r5 = 1
                        if (r1 == r2) goto L_0x002d
                        r2 = -1443174424(0xffffffffa9fae7e8, float:-1.11424596E-13)
                        if (r1 == r2) goto L_0x0023
                        r2 = -999463269(0xffffffffc46d669b, float:-949.6032)
                        if (r1 == r2) goto L_0x0019
                        goto L_0x0037
                    L_0x0019:
                        java.lang.String r1 = "CODE_NOT_SCAN"
                        boolean r0 = r0.equals(r1)
                        if (r0 == 0) goto L_0x0037
                        r0 = r3
                        goto L_0x0038
                    L_0x0023:
                        java.lang.String r1 = "TRADE_SUCCESS"
                        boolean r0 = r0.equals(r1)
                        if (r0 == 0) goto L_0x0037
                        r0 = r4
                        goto L_0x0038
                    L_0x002d:
                        java.lang.String r1 = "WAIT_BUYER_PAY"
                        boolean r0 = r0.equals(r1)
                        if (r0 == 0) goto L_0x0037
                        r0 = r5
                        goto L_0x0038
                    L_0x0037:
                        r0 = -1
                    L_0x0038:
                        if (r0 == 0) goto L_0x005e
                        if (r0 == r5) goto L_0x0053
                        if (r0 == r4) goto L_0x0044
                        java.lang.String r7 = r7.msg
                        com.wujieshuju.huidou.util.ToastUtil.makeText(r7)
                        goto L_0x0063
                    L_0x0044:
                        com.wujieshuju.huidou.ui.fragment.usercenter.ProductPurchaseFragment r7 = com.wujieshuju.huidou.p031ui.fragment.usercenter.ProductPurchaseFragment.this
                        android.app.Dialog r7 = r7.dialog
                        r7.dismiss()
                        java.lang.String r7 = "支付成功"
                        com.wujieshuju.huidou.util.ToastUtil.makeText(r7)
                        goto L_0x0063
                    L_0x0053:
                        android.widget.TextView r7 = r0
                        r7.setVisibility(r3)
                        com.wujieshuju.huidou.ui.fragment.usercenter.ProductPurchaseFragment r7 = com.wujieshuju.huidou.p031ui.fragment.usercenter.ProductPurchaseFragment.this
                        r7.CheckPayStatus()
                        goto L_0x0063
                    L_0x005e:
                        com.wujieshuju.huidou.ui.fragment.usercenter.ProductPurchaseFragment r7 = com.wujieshuju.huidou.p031ui.fragment.usercenter.ProductPurchaseFragment.this
                        r7.CheckPayStatus()
                    L_0x0063:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.wujieshuju.huidou.p031ui.fragment.usercenter.ProductPurchaseFragment.C11243.onComplete(com.wujieshuju.huidou.network.BaseResponse):void");
                }
            });
        }
    }

    private void getUserInfo() {
        HashMap hashMap = new HashMap();
        hashMap.put("product_id", "4");
        OkHttpClientUtil.getInstance().post(Const.URL_GET_USER_INFO, hashMap, UserInfoResponse.class, new OkHttpClientUtil.ResponseCallback() {
            public <T extends BaseResponse> void onComplete(T t) {
                if (t.data != null) {
                    UserInfoResponse.Data data = (UserInfoResponse.Data) t.data;
                    if (ConfigUtil.getInstance().getLoginInfo().validTime != data.valid_time) {
                        ConfigUtil.getInstance().getLoginInfo().validTime = data.valid_time;
                        ConfigUtil.getInstance().updateLoginInfo();
                    }
                }
            }
        });
    }
}
