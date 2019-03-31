package com.zcsoft.rc.api.user.entity;

import org.hibernate.validator.constraints.NotEmpty;

public class UserMachineryFollowReq {

    /**
     * 用户关注id
     */
    @NotEmpty
    private String userFollowId;

    public String getUserFollowId() {
        return userFollowId;
    }

    public void setUserFollowId(String userFollowId) {
        this.userFollowId = userFollowId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserMachineryFollowReq{");
        sb.append("userFollowId='").append(userFollowId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
