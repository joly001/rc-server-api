package com.zcsoft.rc.api.machinery.entity;

import java.util.List;

public class MachineryUserFollowListRsp {

    private List<MachineryUserFollowRsp> list;

    public List<MachineryUserFollowRsp> getList() {
        return list;
    }

    public void setList(List<MachineryUserFollowRsp> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OrganizationUserFollowListRsp{");
        sb.append("list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
