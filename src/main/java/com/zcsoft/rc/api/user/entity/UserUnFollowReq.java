package com.zcsoft.rc.api.user.entity;

import org.hibernate.validator.constraints.NotEmpty;

public class UserUnFollowReq {

    /**
     * 用户关注id
     */
    @NotEmpty
    private String userFollowId;
    /**
     * 组织id
     */
    @NotEmpty
    private String organizationId;

    public String getUserFollowId() {
        return userFollowId;
    }

    public void setUserFollowId(String userFollowId) {
        this.userFollowId = userFollowId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserUnFollowReq{");
        sb.append("userFollowId='").append(userFollowId).append('\'');
        sb.append(", organizationId='").append(organizationId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
