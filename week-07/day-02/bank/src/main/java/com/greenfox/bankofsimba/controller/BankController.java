package com.greenfox.bankofsimba.controller;

import com.greenfox.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class BankController {
    ArrayList<BankAccount> bank = new ArrayList<>(Arrays.asList
            (new BankAccount("Nala", "341", "lion", false, false),
            (new BankAccount("Pumbaa", "56435", "piglet", false, false)),
            (new BankAccount("Rafiki", "532", "somekindofmonkey", false, false)),
            (new BankAccount("Scar", "1532532", "lion", false, true)),
            (new BankAccount("Simba", "20532", "lion",true,false))));

    @RequestMapping("/bank")
    public String bank(Model model) {
        model.addAttribute("bank", bank);
        return "bankinfo";
    }
}
