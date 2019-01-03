package com.lmz.hc.utils;

import java.io.Serializable;
import java.util.Date;

/**
 * User: Scarecrow
 * Date: 2019/1/3
 * Time: 13:36
 * Description: 用户信息
 */
public class UserInfo implements Serializable {
    private String name;
    private String role;
    private String jobNumber;

    private Date loginDate;

    private Date operateDate;

    private Long userId;

    private String loginUuid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Date getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(Date operateDate) {
        this.operateDate = operateDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLoginUuid() {
        return loginUuid;
    }

    public void setLoginUuid(String loginUuid) {
        this.loginUuid = loginUuid;
    }
}
