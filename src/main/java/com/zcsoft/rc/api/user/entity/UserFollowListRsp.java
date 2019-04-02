package com.zcsoft.rc.api.user.entity;

import java.util.Date;

public class UserFollowListRsp {

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
     * 创建时间
     */
    private Date createTime;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserFollowListRsp{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nick='").append(nick).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", builderStatus='").append(builderStatus).append('\'');
        sb.append(", admissionDate=").append(admissionDate);
        sb.append(", leaveDate=").append(leaveDate);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}
