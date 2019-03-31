package com.zcsoft.rc.api.machinery.entity;

import java.util.List;

public class MachineryListRsp {

    private List<MachineryRsp> list;

    public List<MachineryRsp> getList() {
        return list;
    }

    public void setList(List<MachineryRsp> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MachineryListRsp{");
        sb.append("list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
