package com.wujieshuju.huidou.util;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;

public class ProgressUtil {
    public static ProgressDialog createProgressDialog(Context context, String str) {
        if (context instanceof Activity) {
            ProgressDialog progressDialog = new ProgressDialog(context);
            progressDialog.setProgressStyle(0);
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.setCancelable(false);
            progressDialog.setMessage(str);
            return progressDialog;
        }
        throw new IllegalArgumentException("context must be instanceof Activity");
    }

    public static ProgressDialog createHorizontalProgressDialog(Context context, String str) {
        if (context instanceof Activity) {
            ProgressDialog progressDialog = new ProgressDialog(context);
            progressDialog.setProgressStyle(1);
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.setCancelable(false);
            progressDialog.setMessage(str);
            progressDialog.setMax(100);
            progressDialog.setIndeterminate(false);
            return progressDialog;
        }
        throw new IllegalArgumentException("context must be instanceof Activity");
    }

    public static void dismissProgressDialog(ProgressDialog progressDialog) {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }
}
