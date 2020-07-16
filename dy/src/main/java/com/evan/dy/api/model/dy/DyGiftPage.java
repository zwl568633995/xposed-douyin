package com.evan.dy.api.model.dy;

import com.evan.dy.utils.JsonUtils;

import java.util.List;

public class DyGiftPage extends BaseSN<DyGiftPage> {
    public boolean display;
    public String event_name;
    public List<Object> gifts;
    public Object page_operation;
    public String page_name;
    public int page_type;

    @Override
    public DyGiftPage parseFrom(Object obj) {
        return JsonUtils.parseBySerializedName(obj, DyGiftPage.class);
    }

    public static class DyGift extends BaseSN<DyGift> {
        public long id;
        public String describe;
        public String name;
        public boolean combo;
        public String image;
        public int type;
        @Override
        public DyGift parseFrom(Object obj) {
            return JsonUtils.parseBySerializedName(obj, DyGift.class);
        }
    }
}
