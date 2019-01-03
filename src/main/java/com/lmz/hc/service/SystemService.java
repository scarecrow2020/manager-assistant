package com.lmz.hc.service;

import com.lmz.hc.utils.ResultMap;

/**
 * User: Scarecrow
 * Date: 2019/1/3
 * Time: 13:40
 * Description: 系统服务接口
 */
public interface SystemService {
    /**
     * 用户登录
     *
     * @param userName 用户名
     * @param password 密码
     * @return success true成功、false失败; msg失败信息; data登录成功后登录人信息(UserInfo)
     */
    ResultMap login(String userName, String password);

    /**
     * 退出登录
     *
     * @param userId 用户ID
     */
    void logout(Long userId);
}
