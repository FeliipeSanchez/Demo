package com.ucundi.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class index {

    @GetMapping("/index")
    public String showIndex(Model model) {
        model.addAttribute("title", "Home");
        return "index";
    }
}