package com.zcsoft.rc.api.user.entity;

import org.hibernate.validator.constraints.NotEmpty;

public class UserOrganizationReq {

    /**
     * 组织id
     */
    @NotEmpty
    private String organizationId;
    /**
     * 姓名
     */
    private String nick;

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserOrganizationReq{");
        sb.append("organizationId='").append(organizationId).append('\'');
        sb.append(", nick='").append(nick).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
