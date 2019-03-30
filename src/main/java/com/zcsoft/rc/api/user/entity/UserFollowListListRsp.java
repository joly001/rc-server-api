package com.zcsoft.rc.api.user.entity;

import java.util.List;

public class UserFollowListListRsp {

    private List<UserFollowListRsp> list;

    public List<UserFollowListRsp> getList() {
        return list;
    }

    public void setList(List<UserFollowListRsp> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserFollowListListRsp{");
        sb.append("list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
