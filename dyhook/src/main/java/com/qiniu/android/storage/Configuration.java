package com.qiniu.android.storage;

import com.qiniu.android.common.Zone;
import com.qiniu.android.dns.DnsManager;
import com.qiniu.android.dns.IResolver;
import com.qiniu.android.dns.NetworkInfo;
import com.qiniu.android.dns.local.AndroidDnsServer;
import com.qiniu.android.dns.local.Resolver;
import com.qiniu.android.http.ProxyConfiguration;
import com.qiniu.android.http.UrlConverter;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

public final class Configuration {
    public static final int BLOCK_SIZE = 4194304;
    public final int chunkSize;
    public final int connectTimeout;
    public DnsManager dns;
    public final KeyGenerator keyGen;
    public final ProxyConfiguration proxy;
    public final int putThreshold;
    public final Recorder recorder;
    public final int responseTimeout;
    public final int retryMax;
    public UrlConverter urlConverter;
    public Zone zone;

    private Configuration(Builder builder) {
        this.chunkSize = builder.chunkSize;
        this.putThreshold = builder.putThreshold;
        this.connectTimeout = builder.connectTimeout;
        this.responseTimeout = builder.responseTimeout;
        this.recorder = builder.recorder;
        this.keyGen = getKeyGen(builder.keyGen);
        this.retryMax = builder.retryMax;
        this.proxy = builder.proxy;
        this.urlConverter = builder.urlConverter;
        this.zone = builder.zone == null ? Zone.zone0 : builder.zone;
        this.dns = initDns(builder);
    }

    private static DnsManager initDns(Builder builder) {
        DnsManager access$1000 = builder.dns;
        if (access$1000 != null) {
            Zone.addDnsIp(access$1000);
        }
        return access$1000;
    }

    private KeyGenerator getKeyGen(KeyGenerator keyGenerator) {
        return keyGenerator == null ? new KeyGenerator() {
            public String gen(String str, File file) {
                return str + "_._" + new StringBuffer(file.getAbsolutePath()).reverse();
            }
        } : keyGenerator;
    }

    public static class Builder {
        /* access modifiers changed from: private */
        public int chunkSize = 262144;
        /* access modifiers changed from: private */
        public int connectTimeout = 10;
        /* access modifiers changed from: private */
        public DnsManager dns = null;
        /* access modifiers changed from: private */
        public KeyGenerator keyGen = null;
        /* access modifiers changed from: private */
        public ProxyConfiguration proxy = null;
        /* access modifiers changed from: private */
        public int putThreshold = 524288;
        /* access modifiers changed from: private */
        public Recorder recorder = null;
        /* access modifiers changed from: private */
        public int responseTimeout = 60;
        /* access modifiers changed from: private */
        public int retryMax = 3;
        /* access modifiers changed from: private */
        public UrlConverter urlConverter = null;
        /* access modifiers changed from: private */
        public Zone zone = null;

        public Builder() {
            Resolver resolver = null;
            IResolver defaultResolver = AndroidDnsServer.defaultResolver();
            try {
                resolver = new Resolver(InetAddress.getByName("119.29.29.29"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.dns = new DnsManager(NetworkInfo.normal, new IResolver[]{defaultResolver, resolver});
        }

        public Builder zone(Zone zone2) {
            this.zone = zone2;
            return this;
        }

        public Builder recorder(Recorder recorder2) {
            this.recorder = recorder2;
            return this;
        }

        public Builder recorder(Recorder recorder2, KeyGenerator keyGenerator) {
            this.recorder = recorder2;
            this.keyGen = keyGenerator;
            return this;
        }

        public Builder proxy(ProxyConfiguration proxyConfiguration) {
            this.proxy = proxyConfiguration;
            return this;
        }

        public Builder chunkSize(int i) {
            this.chunkSize = i;
            return this;
        }

        public Builder putThreshhold(int i) {
            this.putThreshold = i;
            return this;
        }

        public Builder connectTimeout(int i) {
            this.connectTimeout = i;
            return this;
        }

        public Builder responseTimeout(int i) {
            this.responseTimeout = i;
            return this;
        }

        public Builder retryMax(int i) {
            this.retryMax = i;
            return this;
        }

        public Builder urlConverter(UrlConverter urlConverter2) {
            this.urlConverter = urlConverter2;
            return this;
        }

        public Builder dns(DnsManager dnsManager) {
            this.dns = dnsManager;
            return this;
        }

        public Configuration build() {
            return new Configuration(this);
        }
    }
}
