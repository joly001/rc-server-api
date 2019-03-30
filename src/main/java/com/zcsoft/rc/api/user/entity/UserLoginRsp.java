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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserLoginRsp{");
        sb.append("nick='").append(nick).append('\'');
        sb.append(", wristStrapCode='").append(wristStrapCode).append('\'');
        sb.append(", loginToken='").append(loginToken).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
