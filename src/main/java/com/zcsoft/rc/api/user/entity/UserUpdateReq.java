package com.zcsoft.rc.api.user.entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;

public class UserUpdateReq {

    /**
     * id
     */
    @NotEmpty
    private String id;
    /**
     * 姓名
     */
    @Length(max = 10)
    private String nick;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 手环编码
     */
    private String wristStrapCode;
    /**
     * 用户图片
     */
    private String userPicture;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserUpdateReq{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nick='").append(nick).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", wristStrapCode='").append(wristStrapCode).append('\'');
        sb.append(", userPicture='").append(userPicture).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
