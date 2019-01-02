package com.lmz.hc.test;

import com.lmz.hc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {

    @Autowired
    private UserService userService;
    @RequestMapping("/helloWorld")
    public Object test () {
        return userService.getUser(1L);
    }

    public static void main(String[] args) {

    }
}
