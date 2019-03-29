package com.zcsoft.rc.api.user.entity;

public class UserLoginRsp {

    /**
     * 用户名
     */
    private String username;
    /**
     * 手环编码
     */
    private String wristStrapCode;
    /**
     * 登录TOKEN
     */
    private String loginToken;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserLoginRsp{");
        sb.append("username='").append(username).append('\'');
        sb.append(", wristStrapCode='").append(wristStrapCode).append('\'');
        sb.append(", loginToken='").append(loginToken).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
