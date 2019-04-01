package com.zcsoft.rc.api.user.entity;

public class UserUpdateRsp {

    /**
     * id
     */
    private String id;
    /**
     * 姓名
     */
    private String nick;
    /**
     * 手环编码
     */
    private String wristStrapCode;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 用户图片
     */
    private String userPicture;
    /**
     * 部门
     */
    private String orgName;
    /**
     * 职位
     */
    private String builderUserType;

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

    public String getWristStrapCode() {
        return wristStrapCode;
    }

    public void setWristStrapCode(String wristStrapCode) {
        this.wristStrapCode = wristStrapCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getBuilderUserType() {
        return builderUserType;
    }

    public void setBuilderUserType(String builderUserType) {
        this.builderUserType = builderUserType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserUpdateRsp{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nick='").append(nick).append('\'');
        sb.append(", wristStrapCode='").append(wristStrapCode).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", userPicture='").append(userPicture).append('\'');
        sb.append(", orgName='").append(orgName).append('\'');
        sb.append(", builderUserType='").append(builderUserType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
