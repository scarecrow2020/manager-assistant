package com.lmz.hc.controller;

import com.lmz.hc.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Scarecrow
 * Date: 2019/1/3
 * Time: 13:32
 * Description: 系统操作
 */
@RestController
public class System {

    @Autowired
    private SystemService systemService;

    /**
     * 登录
     *
     * @param userName 用户名
     * @param password 密码
     */
    @RequestMapping("/login")
    public Object login(String userName, String password) {
        return systemService.login(userName, password);
    }

    /**
     * 登出
     *
     * @param userId 用户ID
     */
    @RequestMapping("/logout")
    public void logout(Long userId) {
        systemService.logout(userId);
    }

}
