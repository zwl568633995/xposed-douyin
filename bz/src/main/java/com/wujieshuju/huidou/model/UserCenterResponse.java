package com.wujieshuju.huidou.model;

import com.wujieshuju.huidou.network.BaseResponse;
import java.util.ArrayList;

public class UserCenterResponse extends BaseResponse<Item> {

    public class Item {
        public String avatar;
        public int can_send_report;
        public int channel;
        public int create_id;
        public String db_host;
        public String desc;
        public String email;
        public long expire;
        public String go_server;

        /* renamed from: id */
        public int f988id;
        public int login_status;
        public String pass_word;
        public String real_name;
        public int robot_number;
        public int status;
        public String tel;
        public String user_name;
        public ArrayList<UserProductLimit> user_product_limit;

        public Item() {
        }
    }

    public class UserProductLimit {
        public int is_tryout;
        public int product_id;
        public int status;
        public String valid_time;

        public UserProductLimit() {
        }
    }
}
