package com.wujieshuju.huidou.model;

import com.wujieshuju.huidou.network.BaseResponse;
import java.util.ArrayList;

public class ProductInfoResponse extends BaseResponse<ArrayList<Item>> {

    public static class Item {
        public int month;
        public String name;
        public String price;
        public String scheme_desc;
        public int scheme_id;
        public String scheme_name;
        public int sequence;
    }
}
