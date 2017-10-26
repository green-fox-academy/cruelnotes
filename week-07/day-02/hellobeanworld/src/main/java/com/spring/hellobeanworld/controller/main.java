package com.spring.hellobeanworld.controller;

import com.spring.hellobeanworld.HelloWorld;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class main {

    @RequestMapping("/main")
    public String htmlCeption(Model model) {
        return "hali";
    }
}
