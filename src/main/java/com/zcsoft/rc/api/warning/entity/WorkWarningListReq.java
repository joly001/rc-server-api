package com.zcsoft.rc.api.warning.entity;

public class WorkWarningListReq {

    /**
     * 作业面id
     */
    private String workSegmentId;
    /**
     * 姓名
     */
    private String nick;

    public String getWorkSegmentId() {
        return workSegmentId;
    }

    public void setWorkSegmentId(String workSegmentId) {
        this.workSegmentId = workSegmentId;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WorkWarningListReq{");
        sb.append("workSegmentId='").append(workSegmentId).append('\'');
        sb.append(", nick='").append(nick).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
