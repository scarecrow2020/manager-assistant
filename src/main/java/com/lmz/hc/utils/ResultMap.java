package com.lmz.hc.utils;

import java.io.Serializable;

/**
 * User: Scarecrow
 * Date: 2019/1/3
 * Time: 15:08
 * Description: 请求返回结果
 */
public class ResultMap implements Serializable {
    private Boolean success;
    private String msg;
    private Object result;

    public ResultMap() {
    }

    public ResultMap(Boolean success) {
        this.success = success;
    }

    public ResultMap(Boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public ResultMap(Boolean success, Object result) {
        this.success = success;
        this.result = result;
    }

    public ResultMap(Boolean success, String msg, Object result) {
        this.success = success;
        this.msg = msg;
        this.result = result;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
