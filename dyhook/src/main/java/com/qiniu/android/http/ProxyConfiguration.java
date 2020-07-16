package com.qiniu.android.http;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

public final class ProxyConfiguration {
    public final String hostAddress;
    public final String password;
    public final int port;
    public final Proxy.Type type;
    public final String user;

    public ProxyConfiguration(String str, int i, String str2, String str3, Proxy.Type type2) {
        this.hostAddress = str;
        this.port = i;
        this.user = str2;
        this.password = str3;
        this.type = type2;
    }

    public ProxyConfiguration(String str, int i) {
        this(str, i, (String) null, (String) null, Proxy.Type.HTTP);
    }

    /* access modifiers changed from: package-private */
    public Proxy proxy() {
        return new Proxy(this.type, new InetSocketAddress(this.hostAddress, this.port));
    }

    /* access modifiers changed from: package-private */
    public Authenticator authenticator() {
        return new Authenticator() {
            public Request authenticate(Route route, Response response) throws IOException {
                return response.request().newBuilder().header("Proxy-Authorization", Credentials.basic(ProxyConfiguration.this.user, ProxyConfiguration.this.password)).header("Proxy-Connection", "Keep-Alive").build();
            }
        };
    }
}
