package com.lmz.hc.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lmz.hc.model.SysUser;
import com.lmz.hc.service.UserService;
import com.lmz.hc.utils.JsonParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/user")
public class User {
    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public Object list(Long page, Long size, @JsonParam List<String> role) {
        return userService.page(new Page(page, size));
    }

    @RequestMapping("/save")
    public Object save(@RequestParam SysUser user, Integer a, @RequestParam HashMap<String, String> b) {
        System.out.println(user);
        return user;
    }

}
