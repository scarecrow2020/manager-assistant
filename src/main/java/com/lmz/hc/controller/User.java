package com.lmz.hc.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lmz.hc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class User {
    @Autowired
    private UserService userService;

    @RequestMapping("/userList")
    public Object userList(Long page, Long size){
        return userService.page(new Page(page, size));
    }
}
