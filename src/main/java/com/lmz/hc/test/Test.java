package com.lmz.hc.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {

    @RequestMapping("/helloWorld")
    public Object test () {
        return new String[] {"a", "b", "c"};
    }

}
