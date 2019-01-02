package com.lmz.hc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * User: Scarecrow
 * Date: 2019/1/2
 * Time: 16:21
 * Description: 角色
 */
@Entity
@Table(name = "sys_role")
public class SysRole extends BaseModel implements Serializable {

    private String name;

    private String type;


    private String roleGroup;

    private String introduce;

    @Column(name = "sys_flag")
    private String sysFlag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRoleGroup() {
        return roleGroup;
    }

    public void setRoleGroup(String roleGroup) {
        this.roleGroup = roleGroup;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getSysFlag() {
        return sysFlag;
    }

    public void setSysFlag(String sysFlag) {
        this.sysFlag = sysFlag;
    }
}
