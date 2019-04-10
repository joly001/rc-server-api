package com.zcsoft.rc.api.warning.entity;

import java.util.Date;

public class WorkWarningListRsp {

    /**
     * id
     */
    private String id;
    /**
     * 里程区间名称
     */
    private String mileageSegmentName;
    /**
     * 昵称
     */
    private String nick;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 类型(00:接近警告线)
     */
    private String type;
    /**
     * 创建时间
     */
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMileageSegmentName() {
        return mileageSegmentName;
    }

    public void setMileageSegmentName(String mileageSegmentName) {
        this.mileageSegmentName = mileageSegmentName;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WorkWarningListReq{");
        sb.append("id='").append(id).append('\'');
        sb.append(", mileageSegmentName='").append(mileageSegmentName).append('\'');
        sb.append(", nick='").append(nick).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}
