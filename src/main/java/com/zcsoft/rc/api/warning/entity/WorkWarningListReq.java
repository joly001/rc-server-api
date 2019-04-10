package com.zcsoft.rc.api.warning.entity;

import java.util.Date;

public class WorkWarningListReq {

    /**
     * id
     */
    private String id;
    /**
     * 里程区间名称
     */
    private String mileageSegmentName;
    /**
     * 用户id			db_column: USER_ID
     */
    private String userId;
    /**
     * 施工人员类型(00:机车、01:列车、02:作业人员、03:作业负责人、04:安全员、05:防护员、06:监理、07:其它人员)			db_column: BUILDER_USER_TYPE
     */
    private String builderUserType;
    /**
     * 部门id			db_column: DEP_ID
     */
    private String depId;
    /**
     * 部门名称			db_column: DEP_NAME
     */
    private String depName;
    /**
     * 组织id			db_column: ORG_ID
     */
    private String orgId;
    /**
     * 组织名称			db_column: ORG_NAME
     */
    private String orgName;
    /**
     * 昵称			db_column: NICK
     */
    private String nick;
    /**
     * 手机			db_column: MOBILE
     */
    private String mobile;
    /**
     * 状态(CREATE:创建、FINISH:结束)			db_column: STATUS
     */
    private String status;
    /**
     * 类型(00:接近警告线)			db_column: TYPE
     */
    private String type;
    /**
     * 创建时间			db_column: CREATE_TIME
     */
    private Date createTime;
    /**
     * 修改时间			db_column: MODIFY_TIME
     */
    private Date modifyTime;

}
