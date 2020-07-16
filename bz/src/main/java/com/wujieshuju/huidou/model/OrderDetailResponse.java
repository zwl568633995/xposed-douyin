package com.wujieshuju.huidou.model;

import com.wujieshuju.huidou.network.BaseResponse;
import java.util.ArrayList;

public class OrderDetailResponse extends BaseResponse<ArrayList<Item>> {

    public class Item {
        public String created;

        /* renamed from: id */
        public int f987id;
        public String order_no;
        public String pay_code;
        public String pay_money;
        public int pay_status;
        public int product_id;
        public int user_id;
        public String valid_time;

        public Item() {
        }
    }
}
