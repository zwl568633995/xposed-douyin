package com.p028ut.mini.core.sign;

import com.alibaba.mtl.log.p016d.Logger;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.ut.mini.core.sign.UTSecuritySDKRequestAuthentication */
public class UTSecuritySDKRequestAuthentication implements IUTRequestAuthentication {

    /* renamed from: F */
    private boolean f933F = false;

    /* renamed from: a */
    private Class f934a = null;

    /* renamed from: a */
    private Field f935a = null;

    /* renamed from: a */
    private Method f936a = null;

    /* renamed from: ad */
    private String f937ad;

    /* renamed from: b */
    private Object f938b = null;

    /* renamed from: b */
    private Field f939b = null;

    /* renamed from: c */
    private Object f940c = null;

    /* renamed from: c */
    private Field f941c = null;

    /* renamed from: g */
    private String f942g = null;

    /* renamed from: z */
    private int f943z = 1;

    public String getAppkey() {
        return this.f942g;
    }

    public UTSecuritySDKRequestAuthentication(String str, String str2) {
        this.f942g = str;
        this.f937ad = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m801D() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f933F     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            r0 = 0
            r1 = 1
            r2 = 0
            java.lang.String r3 = "com.alibaba.wireless.security.open.SecurityGuardManager"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0043 }
            java.lang.String r4 = "getInstance"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ all -> 0x0041 }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r2] = r6     // Catch:{ all -> 0x0041 }
            java.lang.reflect.Method r4 = r3.getMethod(r4, r5)     // Catch:{ all -> 0x0041 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x0041 }
            com.alibaba.mtl.log.b r6 = com.alibaba.mtl.log.UTMCStatConfig.mo9570a()     // Catch:{ all -> 0x0041 }
            android.content.Context r6 = r6.getContext()     // Catch:{ all -> 0x0041 }
            r5[r2] = r6     // Catch:{ all -> 0x0041 }
            java.lang.Object r4 = r4.invoke(r0, r5)     // Catch:{ all -> 0x0041 }
            r7.f938b = r4     // Catch:{ all -> 0x0041 }
            java.lang.String r4 = "getSecureSignatureComp"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ all -> 0x0041 }
            java.lang.reflect.Method r4 = r3.getMethod(r4, r5)     // Catch:{ all -> 0x0041 }
            java.lang.Object r5 = r7.f938b     // Catch:{ all -> 0x0041 }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0041 }
            java.lang.Object r4 = r4.invoke(r5, r6)     // Catch:{ all -> 0x0041 }
            r7.f940c = r4     // Catch:{ all -> 0x0041 }
            goto L_0x004e
        L_0x0041:
            r4 = move-exception
            goto L_0x0045
        L_0x0043:
            r4 = move-exception
            r3 = r0
        L_0x0045:
            java.lang.String r5 = "initSecurityCheck"
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x00df }
            com.alibaba.mtl.log.p016d.Logger.m288a((java.lang.String) r5, (java.lang.Object) r4)     // Catch:{ all -> 0x00df }
        L_0x004e:
            if (r3 == 0) goto L_0x00db
            java.lang.String r4 = "com.alibaba.wireless.security.open.SecurityGuardParamContext"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x00d1 }
            r7.f934a = r4     // Catch:{ all -> 0x00d1 }
            java.lang.String r5 = "appKey"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch:{ all -> 0x00d1 }
            r7.f935a = r4     // Catch:{ all -> 0x00d1 }
            java.lang.Class r4 = r7.f934a     // Catch:{ all -> 0x00d1 }
            java.lang.String r5 = "paramMap"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch:{ all -> 0x00d1 }
            r7.f939b = r4     // Catch:{ all -> 0x00d1 }
            java.lang.Class r4 = r7.f934a     // Catch:{ all -> 0x00d1 }
            java.lang.String r5 = "requestType"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch:{ all -> 0x00d1 }
            r7.f941c = r4     // Catch:{ all -> 0x00d1 }
            java.lang.String r4 = "isOpen"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ all -> 0x007d }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch:{ all -> 0x007d }
            goto L_0x0088
        L_0x007d:
            r3 = move-exception
            java.lang.String r4 = "initSecurityCheck"
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00d1 }
            com.alibaba.mtl.log.p016d.Logger.m288a((java.lang.String) r4, (java.lang.Object) r3)     // Catch:{ all -> 0x00d1 }
            r3 = r0
        L_0x0088:
            if (r3 == 0) goto L_0x0099
            java.lang.Object r0 = r7.f938b     // Catch:{ all -> 0x00d1 }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x00d1 }
            java.lang.Object r0 = r3.invoke(r0, r4)     // Catch:{ all -> 0x00d1 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00d1 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00d1 }
            goto L_0x00af
        L_0x0099:
            java.lang.String r3 = "com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent"
            java.lang.Class r0 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x00a0 }
            goto L_0x00aa
        L_0x00a0:
            r3 = move-exception
            java.lang.String r4 = "initSecurityCheck"
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00d1 }
            com.alibaba.mtl.log.p016d.Logger.m288a((java.lang.String) r4, (java.lang.Object) r3)     // Catch:{ all -> 0x00d1 }
        L_0x00aa:
            if (r0 != 0) goto L_0x00ae
            r0 = r1
            goto L_0x00af
        L_0x00ae:
            r0 = r2
        L_0x00af:
            if (r0 == 0) goto L_0x00b3
            r0 = r1
            goto L_0x00b5
        L_0x00b3:
            r0 = 12
        L_0x00b5:
            r7.f943z = r0     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = "com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x00d1 }
            java.lang.String r3 = "signRequest"
            r4 = 2
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ all -> 0x00d1 }
            java.lang.Class r5 = r7.f934a     // Catch:{ all -> 0x00d1 }
            r4[r2] = r5     // Catch:{ all -> 0x00d1 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r4[r1] = r2     // Catch:{ all -> 0x00d1 }
            java.lang.reflect.Method r0 = r0.getMethod(r3, r4)     // Catch:{ all -> 0x00d1 }
            r7.f936a = r0     // Catch:{ all -> 0x00d1 }
            goto L_0x00db
        L_0x00d1:
            r0 = move-exception
            java.lang.String r2 = "initSecurityCheck"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00df }
            com.alibaba.mtl.log.p016d.Logger.m288a((java.lang.String) r2, (java.lang.Object) r0)     // Catch:{ all -> 0x00df }
        L_0x00db:
            r7.f933F = r1     // Catch:{ all -> 0x00df }
            monitor-exit(r7)
            return
        L_0x00df:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p028ut.mini.core.sign.UTSecuritySDKRequestAuthentication.m801D():void");
    }

    public String getSign(String str) {
        Class cls;
        if (!this.f933F) {
            m801D();
        }
        if (this.f942g == null) {
            Logger.m288a("UTSecuritySDKRequestAuthentication:getSign", (Object) "There is no appkey,please check it!");
            return null;
        } else if (str == null || this.f938b == null || (cls = this.f934a) == null || this.f935a == null || this.f939b == null || this.f941c == null || this.f936a == null || this.f940c == null) {
            return null;
        } else {
            try {
                Object newInstance = cls.newInstance();
                this.f935a.set(newInstance, this.f942g);
                ((Map) this.f939b.get(newInstance)).put("INPUT", str);
                this.f941c.set(newInstance, Integer.valueOf(this.f943z));
                return (String) this.f936a.invoke(this.f940c, new Object[]{newInstance, this.f937ad});
            } catch (InstantiationException e) {
                e.printStackTrace();
                return null;
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return null;
            } catch (IllegalArgumentException e3) {
                e3.printStackTrace();
                return null;
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
                return null;
            }
        }
    }

    public String getAuthCode() {
        return this.f937ad;
    }
}
