package com.greenfox.bankofsimba.controller;

import com.greenfox.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccController {
    BankAccount acc = new BankAccount("Simba", "2000", "lion", true, false);

    @RequestMapping("/accinf")
    public String accountInfo(Model model) {
        model.addAttribute("acc", acc);
        return "accinfo";
    }
}
