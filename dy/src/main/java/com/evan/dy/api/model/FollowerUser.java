package com.evan.dy.api.model;

import com.evan.dy.api.model.dy.DyFollowerUser;
import com.evan.dy.api.model.dy.User;

import java.util.ArrayList;
import java.util.List;

public class FollowerUser {
    private final Object obj;
    private DyFollowerUser dyFollowerUser;
    private List<User> followers;

    public FollowerUser(Object obj) {
        this.obj = obj;
        dyFollowerUser = new DyFollowerUser().parseFrom(obj);
        if (dyFollowerUser == null) {
            dyFollowerUser = new DyFollowerUser();
        }
    }

    public Object getObj() {
        return obj;
    }

    public List<User> getFollowers() {
        if (followers == null) {
            if (dyFollowerUser != null && dyFollowerUser.followers != null && dyFollowerUser.followers.size() > 0) {
                followers = new ArrayList<>();
                for (Object follower : dyFollowerUser.followers) {
                    followers.add(new User().parseFrom(follower));
                }
            }
        }
        return followers;
    }

    public List<User> getByFollowers(int gender, int followStatus) {
        if (getFollowers() == null) {
            return null;
        }
        List<User> list = new ArrayList<>();
        for (User follower : getFollowers()) {
            if ((gender == -1 || gender == follower.gender) && (followStatus == -1 || followStatus == follower.followStatus)) {
                list.add(follower);
            }
        }
        return list;
    }


    public int getTotal() {
        return dyFollowerUser.total;
    }
    public boolean hasMore() {
        return dyFollowerUser.has_more;
    }

    public long getMin_time() {
        return dyFollowerUser.min_time;
    }

    public int getOffset() {
        return dyFollowerUser.offset;
    }

    public String getHotsoon_text() {
        return dyFollowerUser.hotsoon_text;
    }

    public int getVcd_count() {
        return dyFollowerUser.vcd_count;
    }

    public int getHotsoon_has_more() {
        return dyFollowerUser.hotsoon_has_more;
    }


}
