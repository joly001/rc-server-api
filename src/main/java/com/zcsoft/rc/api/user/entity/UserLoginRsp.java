package com.zcsoft.rc.api.user.entity;

public class UserLoginRsp {

    /**
     * 姓名
     */
    private String nick;
    /**
     * 手环编码
     */
    private String wristStrapCode;
    /**
     * 登录TOKEN
     */
    private String loginToken;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 用户图片
     */
    private String userPicture;
    /**
     * 组织名称
     */
    private String orgName;
    /**
     * 施工人员类型
     */
    private String builderUserType;

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

    public String getLoginToken() {
        return loginToken;
    }

    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken;
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
        final StringBuilder sb = new StringBuilder("UserLoginRsp{");
        sb.append("nick='").append(nick).append('\'');
        sb.append(", wristStrapCode='").append(wristStrapCode).append('\'');
        sb.append(", loginToken='").append(loginToken).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", userPicture='").append(userPicture).append('\'');
        sb.append(", orgName='").append(orgName).append('\'');
        sb.append(", builderUserType='").append(builderUserType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
