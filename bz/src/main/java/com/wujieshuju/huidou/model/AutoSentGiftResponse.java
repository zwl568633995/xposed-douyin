package com.wujieshuju.huidou.model;

import com.wujieshuju.huidou.network.BaseResponse;
import java.util.List;

public class AutoSentGiftResponse extends BaseResponse<Data> {

    public static class Data {
        public String gift_json;

        /* renamed from: id */
        public String f985id;
        public String interval;
        public String status;
        public String threshold;
    }

    public static class GIFT_JSON {
        public List<String> gift_json;
    }
}
