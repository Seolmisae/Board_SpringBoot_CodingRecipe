package com.example.Board_SpringBoot_CR.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/Board_SpringBoot_CR/index")
    public String index() {
        return "index";
    }
}
