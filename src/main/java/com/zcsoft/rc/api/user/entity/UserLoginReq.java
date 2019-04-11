package com.zcsoft.rc.api.user.entity;


import org.hibernate.validator.constraints.NotEmpty;

public class UserLoginReq {

    /**
     * 用户名
     */
    @NotEmpty
    private String username;
    /**
     * 密码
     */
    @NotEmpty
    private String password;
    /**
     * 消息推送token
     */
    @NotEmpty
    private String messagingToken;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessagingToken() {
        return messagingToken;
    }

    public void setMessagingToken(String messagingToken) {
        this.messagingToken = messagingToken;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserLoginReq{");
        sb.append("username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", messagingToken='").append(messagingToken).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
