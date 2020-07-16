package com.wujieshuju.huidou.p031ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: com.wujieshuju.huidou.ui.dialog.ShowAliPayQRCodeDialog */
public class ShowAliPayQRCodeDialog extends Dialog implements View.OnClickListener {
    private View dialog;

    public void onClick(View view) {
    }

    public ShowAliPayQRCodeDialog(Context context, int i) {
        super(context, i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 17;
        window.setAttributes(attributes);
    }
}
