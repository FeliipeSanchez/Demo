package com.ucundi.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class combos {
    

    @GetMapping("/combos")
    public String showIndex(Model model) {
        model.addAttribute("title", "Combos");
        return "index";
    }
}
