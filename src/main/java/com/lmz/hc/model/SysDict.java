package com.lmz.hc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * User: Scarecrow
 * Date: 2019/1/2
 * Time: 16:27
 * Description: 字典
 */
@Entity
@Table(name = "sys_dict")
public class SysDict extends BaseModel implements Serializable {

    private String type;

    @Column(name = "dict_key")
    private String dictKey;

    @Column(name = "dict_value")
    private String dictValue;

    @Column(name = "parent_key")
    private String parentKey;

    private Integer sequence;

    @Column(name = "sys_flag")
    private String sysFlag;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDictKey() {
        return dictKey;
    }

    public void setDictKey(String dictKey) {
        this.dictKey = dictKey;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public String getParentKey() {
        return parentKey;
    }

    public void setParentKey(String parentKey) {
        this.parentKey = parentKey;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getSysFlag() {
        return sysFlag;
    }

    public void setSysFlag(String sysFlag) {
        this.sysFlag = sysFlag;
    }
}
