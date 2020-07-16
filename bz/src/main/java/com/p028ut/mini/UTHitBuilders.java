package com.p028ut.mini;

import android.text.TextUtils;
import com.alibaba.mtl.log.model.LogField;
import com.alibaba.mtl.log.p016d.C0661q;
import com.alibaba.mtl.log.p016d.Logger;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ut.mini.UTHitBuilders */
public class UTHitBuilders {

    /* renamed from: com.ut.mini.UTHitBuilders$UTHitBuilder */
    public static class UTHitBuilder {
        public static final String FIELD_ARG1 = "_field_arg1";
        public static final String FIELD_ARG2 = "_field_arg2";
        public static final String FIELD_ARG3 = "_field_arg3";
        public static final String FIELD_ARGS = "_field_args";
        public static final String FIELD_EVENT_ID = "_field_event_id";
        public static final String FIELD_PAGE = "_field_page";

        /* renamed from: y */
        private Map<String, String> f888y;

        public UTHitBuilder() {
            HashMap hashMap = new HashMap();
            this.f888y = hashMap;
            if (!hashMap.containsKey(FIELD_PAGE)) {
                this.f888y.put(FIELD_PAGE, "UT");
            }
        }

        public UTHitBuilder setProperty(String str, String str2) {
            if (TextUtils.isEmpty(str) || str2 == null) {
                Logger.m288a("setProperty", (Object) "key is null or key is empty or value is null,please check it!");
            } else {
                if (this.f888y.containsKey(str)) {
                    this.f888y.remove(str);
                }
                this.f888y.put(str, str2);
            }
            return this;
        }

        public UTHitBuilder setProperties(Map<String, String> map) {
            if (map != null) {
                this.f888y.putAll(map);
            }
            return this;
        }

        public String getProperty(String str) {
            if (str == null || !this.f888y.containsKey(str)) {
                return null;
            }
            return this.f888y.get(str);
        }

        public Map<String, String> build() {
            HashMap hashMap = new HashMap();
            hashMap.putAll(this.f888y);
            if (!m766a(hashMap)) {
                return null;
            }
            m768e(hashMap);
            m767d(hashMap);
            if (!hashMap.containsKey(LogField.EVENTID.toString())) {
                return null;
            }
            return hashMap;
        }

        /* renamed from: a */
        private static boolean m766a(Map<String, String> map) {
            if (map == null) {
                return true;
            }
            if (map.containsKey((Object) null)) {
                map.remove((Object) null);
            }
            if (map.containsKey("")) {
                map.remove("");
            }
            if (map.containsKey(LogField.PAGE.toString())) {
                Logger.m288a("checkIlleagleProperty", (Object) "IlleaglePropertyKey(PAGE) is setted when you call the method setProperty or setProperties ,please use another key to replace it!");
                return false;
            } else if (map.containsKey(LogField.EVENTID.toString())) {
                Logger.m288a("checkIlleagleProperty", (Object) "IlleaglePropertyKey(EVENTID) is setted when you call the method setProperty or setProperties ,please use another key to replace it!");
                return false;
            } else if (map.containsKey(LogField.ARG1.toString())) {
                Logger.m288a("checkIlleagleProperty", (Object) "IlleaglePropertyKey(ARG1) is setted when you call the method setProperty or setProperties ,please use another key to replace it!");
                return false;
            } else if (map.containsKey(LogField.ARG2.toString())) {
                Logger.m288a("checkIlleagleProperty", (Object) "IlleaglePropertyKey(ARG2) is setted when you call the method setProperty or setProperties ,please use another key to replace it!");
                return false;
            } else if (!map.containsKey(LogField.ARG3.toString())) {
                return true;
            } else {
                Logger.m288a("checkIlleagleProperty", (Object) "IlleaglePropertyKey(ARG3) is setted when you call the method setProperty or setProperties ,please use another key to replace it!");
                return false;
            }
        }

        /* renamed from: d */
        private static void m767d(Map<String, String> map) {
            if (map != null) {
                if (map.containsKey(FIELD_PAGE)) {
                    map.remove(FIELD_PAGE);
                    map.put(LogField.PAGE.toString(), map.get(FIELD_PAGE));
                }
                if (map.containsKey(FIELD_ARG1)) {
                    map.remove(FIELD_ARG1);
                    map.put(LogField.ARG1.toString(), map.get(FIELD_ARG1));
                }
                if (map.containsKey(FIELD_ARG2)) {
                    map.remove(FIELD_ARG2);
                    map.put(LogField.ARG2.toString(), map.get(FIELD_ARG2));
                }
                if (map.containsKey(FIELD_ARG3)) {
                    map.remove(FIELD_ARG3);
                    map.put(LogField.ARG3.toString(), map.get(FIELD_ARG3));
                }
                if (map.containsKey(FIELD_ARGS)) {
                    map.remove(FIELD_ARGS);
                    map.put(LogField.ARGS.toString(), map.get(FIELD_ARGS));
                }
                if (map.containsKey(FIELD_EVENT_ID)) {
                    map.remove(FIELD_EVENT_ID);
                    map.put(LogField.EVENTID.toString(), map.get(FIELD_EVENT_ID));
                }
            }
        }

        /* renamed from: e */
        private static void m768e(Map<String, String> map) {
            if (map != null) {
                if (map.containsKey(LogField.PAGE.toString())) {
                    map.remove(LogField.PAGE.toString());
                }
                if (map.containsKey(LogField.EVENTID.toString())) {
                    map.remove(LogField.EVENTID.toString());
                }
                if (map.containsKey(LogField.ARG1.toString())) {
                    map.remove(LogField.ARG1.toString());
                }
                if (map.containsKey(LogField.ARG2.toString())) {
                    map.remove(LogField.ARG2.toString());
                }
                if (map.containsKey(LogField.ARG3.toString())) {
                    map.remove(LogField.ARG3.toString());
                }
                if (map.containsKey(LogField.ARGS.toString())) {
                    map.remove(LogField.ARGS.toString());
                }
            }
        }
    }

    /* renamed from: com.ut.mini.UTHitBuilders$UTCustomHitBuilder */
    public static class UTCustomHitBuilder extends UTHitBuilder {
        public UTCustomHitBuilder(String str) {
            if (!TextUtils.isEmpty(str)) {
                super.setProperty(UTHitBuilder.FIELD_ARG1, str);
            }
            super.setProperty(UTHitBuilder.FIELD_EVENT_ID, "19999");
            super.setProperty(UTHitBuilder.FIELD_ARG3, "0");
        }

        public UTCustomHitBuilder setDurationOnEvent(long j) {
            if (j < 0) {
                j = 0;
            }
            super.setProperty(UTHitBuilder.FIELD_ARG3, "" + j);
            return this;
        }

        public UTCustomHitBuilder setEventPage(String str) {
            if (!TextUtils.isEmpty(str)) {
                super.setProperty(UTHitBuilder.FIELD_PAGE, str);
            }
            return this;
        }

        public Map<String, String> build() {
            Map<String, String> build = super.build();
            if (build == null) {
                return build;
            }
            String str = build.get(LogField.PAGE.toString());
            String str2 = build.get(LogField.ARG1.toString());
            if (str2 == null) {
                return build;
            }
            build.remove(LogField.ARG1.toString());
            build.remove(LogField.PAGE.toString());
            Map<String, String> b = C0661q.m314b(build);
            b.put(LogField.ARG1.toString(), str2);
            b.put(LogField.PAGE.toString(), str);
            return b;
        }
    }

    /* renamed from: com.ut.mini.UTHitBuilders$UTPageHitBuilder */
    public static class UTPageHitBuilder extends UTHitBuilder {
        public UTPageHitBuilder(String str) {
            if (!TextUtils.isEmpty(str)) {
                super.setProperty(UTHitBuilder.FIELD_PAGE, str);
            }
            super.setProperty(UTHitBuilder.FIELD_EVENT_ID, "2001");
            super.setProperty(UTHitBuilder.FIELD_ARG3, "0");
        }

        public UTPageHitBuilder setReferPage(String str) {
            if (!TextUtils.isEmpty(str)) {
                super.setProperty(UTHitBuilder.FIELD_ARG1, str);
            }
            return this;
        }

        public UTPageHitBuilder setDurationOnPage(long j) {
            if (j < 0) {
                j = 0;
            }
            super.setProperty(UTHitBuilder.FIELD_ARG3, "" + j);
            return this;
        }
    }

    /* renamed from: com.ut.mini.UTHitBuilders$UTControlHitBuilder */
    public static class UTControlHitBuilder extends UTHitBuilder {
        public UTControlHitBuilder(String str) {
            if (!TextUtils.isEmpty(str)) {
                String currentPageName = UTPageHitHelper.getInstance().getCurrentPageName();
                if (!TextUtils.isEmpty(currentPageName)) {
                    super.setProperty(UTHitBuilder.FIELD_PAGE, currentPageName);
                    super.setProperty(UTHitBuilder.FIELD_EVENT_ID, "2101");
                    super.setProperty(UTHitBuilder.FIELD_ARG1, currentPageName + "_" + str);
                    return;
                }
                throw new IllegalArgumentException("Please call in at PageAppear and PageDisAppear.");
            }
            throw new IllegalArgumentException("Control name can not be empty.");
        }

        public UTControlHitBuilder(String str, String str2) {
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("Control name can not be empty.");
            } else if (!TextUtils.isEmpty(str)) {
                super.setProperty(UTHitBuilder.FIELD_PAGE, str);
                super.setProperty(UTHitBuilder.FIELD_EVENT_ID, "2101");
                super.setProperty(UTHitBuilder.FIELD_ARG1, str + "_" + str2);
            } else {
                throw new IllegalArgumentException("Page name can not be empty.");
            }
        }
    }
}
