package com.wujieshuju.huidou.model;

import com.wujieshuju.huidou.network.BaseResponse;

public class OrderResponse extends BaseResponse<DATA> {

    public static class DATA {
        public String price;
        public String qr_code;
    }
}
