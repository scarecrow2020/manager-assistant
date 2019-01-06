package com.lmz.hc.controller.test;

import com.lmz.hc.model.SysUser;
import com.lmz.hc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class Test {

    @Autowired
    private UserService userService;
    @RequestMapping("/helloWorld")
    public void test (List<String> a) {
        System.out.println(a);
        // return userService.getUser(1L);
    }

    @RequestMapping("/helloWorld1")
    public void test1 (@RequestBody Map<String, SysUser> a) {
        System.out.println(a);
        // return userService.getUser(1L);
    }
    @RequestMapping(value = "/helloWorld2")
    public void test2 (@RequestBody SysUser a) {
        System.out.println(a);
        // return userService.getUser(1L);
    }
    @RequestMapping("/helloWorld3")
    public void test3 (Integer a) {
        System.out.println(a);
        // return userService.getUser(1L);
    }
    public static void main(String[] args) {

    }
}
