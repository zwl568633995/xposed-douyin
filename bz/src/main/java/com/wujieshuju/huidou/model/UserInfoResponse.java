package com.wujieshuju.huidou.model;

import com.wujieshuju.huidou.network.BaseResponse;
import java.util.List;

public class UserInfoResponse extends BaseResponse<Data> {

    public class Data {
        public String channel;
        public String db_host;
        public long expire;
        public String go_server;

        /* renamed from: id */
        public int f989id;
        public int status;
        public List<UserProductLimit> user_product_limit;
        public long valid_time;

        public Data() {
        }
    }

    public class UserProductLimit {
        public int product_id;
        public String valid_time;

        public UserProductLimit() {
        }
    }
}
