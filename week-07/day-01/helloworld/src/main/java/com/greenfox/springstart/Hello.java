package com.greenfox.springstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/")
//    @ResponseBody
    public String hello() {
        return "hello world";
    }
}
