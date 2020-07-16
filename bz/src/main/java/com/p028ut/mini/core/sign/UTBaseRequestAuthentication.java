package com.p028ut.mini.core.sign;

import com.alibaba.mtl.log.p016d.Logger;
import com.alibaba.mtl.log.p016d.MD5Utils;

/* renamed from: com.ut.mini.core.sign.UTBaseRequestAuthentication */
public class UTBaseRequestAuthentication implements IUTRequestAuthentication {

    /* renamed from: E */
    private boolean f930E = false;

    /* renamed from: ac */
    private String f931ac = null;

    /* renamed from: g */
    private String f932g = null;

    public String getAppkey() {
        return this.f932g;
    }

    public String getAppSecret() {
        return this.f931ac;
    }

    public UTBaseRequestAuthentication(String str, String str2) {
        this.f932g = str;
        this.f931ac = str2;
    }

    public UTBaseRequestAuthentication(String str, String str2, boolean z) {
        this.f932g = str;
        this.f931ac = str2;
        this.f930E = z;
    }

    public boolean isEncode() {
        return this.f930E;
    }

    public String getSign(String str) {
        if (this.f932g == null || this.f931ac == null) {
            Logger.m288a("UTBaseRequestAuthentication", (Object) "There is no appkey,please check it!");
            return null;
        } else if (str == null) {
            return null;
        } else {
            return MD5Utils.m295a(MD5Utils.m295a((str + this.f931ac).getBytes()));
        }
    }
}
