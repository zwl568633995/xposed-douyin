package com.xp.wx.backend.douyin.model;

import java.util.ArrayList;

public class PromotionResponse extends DyResponse {
    public String current_promotion_id;
    public ArrayList<Promotion> promotions;
    public int room_type;

    public static class Promotion {
        public String product_id;
        public String promotion_id;
    }
}
