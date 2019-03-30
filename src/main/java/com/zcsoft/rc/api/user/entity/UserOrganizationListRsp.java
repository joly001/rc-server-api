package com.zcsoft.rc.api.user.entity;

import java.util.List;

public class UserOrganizationListRsp {

    private List<UserOrganizationRsp> list;

    public List<UserOrganizationRsp> getList() {
        return list;
    }

    public void setList(List<UserOrganizationRsp> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserOrganizationListRsp{");
        sb.append("list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
