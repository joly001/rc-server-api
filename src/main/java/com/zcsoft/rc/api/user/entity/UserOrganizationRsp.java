package com.zcsoft.rc.api.user.entity;

import java.util.Date;

public class UserOrganizationRsp {

    /**
     * id
     */
    private String id;
    /**
     * 姓名
     */
    private String nick;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 施工人员状态(00:入场、01:出场)
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
     * 手环编码
     */
    private String wristStrapCode;
    /**
     * 用户图片
     */
    private String userPicture;
    /**
     * 职位
     */
    private String builderUserType;
    /**
     * 组织id
     */
    private String organizationId;
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

    public String getWristStrapCode() {
        return wristStrapCode;
    }

    public void setWristStrapCode(String wristStrapCode) {
        this.wristStrapCode = wristStrapCode;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }

    public String getBuilderUserType() {
        return builderUserType;
    }

    public void setBuilderUserType(String builderUserType) {
        this.builderUserType = builderUserType;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
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
        sb.append(", wristStrapCode='").append(wristStrapCode).append('\'');
        sb.append(", userPicture='").append(userPicture).append('\'');
        sb.append(", builderUserType='").append(builderUserType).append('\'');
        sb.append(", organizationId='").append(organizationId).append('\'');
        sb.append(", isFollow=").append(isFollow);
        sb.append('}');
        return sb.toString();
    }
}
