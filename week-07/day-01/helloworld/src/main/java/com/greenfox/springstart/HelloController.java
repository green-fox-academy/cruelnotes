package com.greenfox.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "hello world";
    }
//    @RequestMapping("/greeting")
//    @ResponseBody
//    public String greeting() {
//        Greeting rev = new Greeting(new AtomicLong(1), "Hello");
//        return ("id:" + rev.getId() + "content:" + rev.getContent());
//
//    }

}
