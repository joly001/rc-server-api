package com.zcsoft.rc.api.user.entity;

public class UserPhotoRsp {

    /**
     * 图片地址
     */
    private String userPhotoPath;

    public String getUserPhotoPath() {
        return userPhotoPath;
    }

    public void setUserPhotoPath(String userPhotoPath) {
        this.userPhotoPath = userPhotoPath;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserPhotoRsp{");
        sb.append("userPhotoPath='").append(userPhotoPath).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
