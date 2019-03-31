package com.zcsoft.rc.api.machinery.entity;

import java.util.List;

public class MachineryListRsp {

    private List<MachineryRsp> machineryRspList;

    public List<MachineryRsp> getMachineryRspList() {
        return machineryRspList;
    }

    public void setMachineryRspList(List<MachineryRsp> machineryRspList) {
        this.machineryRspList = machineryRspList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MachineryListRsp{");
        sb.append("machineryRspList=").append(machineryRspList);
        sb.append('}');
        return sb.toString();
    }
}
