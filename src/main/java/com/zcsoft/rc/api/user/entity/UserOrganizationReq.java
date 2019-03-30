package com.zcsoft.rc.api.user.entity;

import org.hibernate.validator.constraints.NotEmpty;

public class UserOrganizationReq {

    /**
     * 组织id
     */
    @NotEmpty
    private String organizationId;

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserOrganizationReq{");
        sb.append("organizationId='").append(organizationId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
