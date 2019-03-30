package com.zcsoft.rc.api.user.entity;

import java.util.Date;

public class UserOrganizationRsp {

    /**
     * id
     */
    private String id;
    /**
     * 昵称
     */
    private String nick;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 施工人员状态(00:入场、01:出厂)
     */
    private String builderStatus;
    /**
     * 入场时间
     */
    private Date admissionDate;
    /**
     * 离场时间
     */
    private Date leaveDate;
    /**
     * 是否关注
     */
    private Boolean isFollow;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getBuilderStatus() {
        return builderStatus;
    }

    public void setBuilderStatus(String builderStatus) {
        this.builderStatus = builderStatus;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public Boolean getFollow() {
        return isFollow;
    }

    public void setFollow(Boolean follow) {
        isFollow = follow;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserOrganizationRsp{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nick='").append(nick).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", builderStatus='").append(builderStatus).append('\'');
        sb.append(", admissionDate=").append(admissionDate);
        sb.append(", leaveDate=").append(leaveDate);
        sb.append(", isFollow=").append(isFollow);
        sb.append('}');
        return sb.toString();
    }
}
