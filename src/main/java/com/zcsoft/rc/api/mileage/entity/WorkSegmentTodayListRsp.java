package com.zcsoft.rc.api.mileage.entity;

import java.util.List;

public class WorkSegmentTodayListRsp {

    private List<WorkSegmentTodayRsp> list;

    public List<WorkSegmentTodayRsp> getList() {
        return list;
    }

    public void setList(List<WorkSegmentTodayRsp> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WorkSegmentTodayList{");
        sb.append("list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
