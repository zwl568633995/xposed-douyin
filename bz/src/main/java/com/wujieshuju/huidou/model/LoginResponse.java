package com.wujieshuju.huidou.model;

import com.wujieshuju.huidou.network.BaseResponse;

public class LoginResponse extends BaseResponse<DATA> {

    public static class DATA {
        public int is_expire;
        public long valid_time;
    }
}
