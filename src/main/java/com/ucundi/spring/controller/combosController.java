package com.ucundi.spring.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ucundi.spring.domain.combosEntity;
import com.ucundi.spring.repositories.combosRepositories;

@RestController
@RequestMapping("/api")
public class combosController {

    private final combosRepositories combosRepo;

    @Autowired
    public combosController(combosRepositories camsRepo) {
        this.combosRepo = camsRepo;
    }

    @GetMapping("/createCombos")
    public String addCombos() {
        return "Combo adicionado satisfactoriamente";
    }

    @GetMapping("/createCombos/{id}")
    public String addCombos(@PathVariable("id") String id) {
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Combo adicionado satisfactoriamente " + id;
    }

    @GetMapping("/readCombos")
    public String readCombos() {
        return "Combo encontrado satisfactoriamente";
    }

    @GetMapping("/readCombos/{id}")
    public Optional<combosEntity> readCombos(@PathVariable("id") String id) {
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return combosRepo.findById(Long.valueOf(id));
    }

    @GetMapping("/updateCombos")
    public String updateCombos() {
        return "Combos actualizados satisfactoriamente";
    }

    @GetMapping("/updateCombos/{id}")
    public String updateCombos(@PathVariable("id") String id) {
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Combos actualizados satisfactoriamente " + id;
    }

    @GetMapping("/deleteCombos")
    public String deleteCombos() {
        return "Combos eliminados satisfactoriamente";
    }

    @GetMapping("/deleteCombos/{id}")
    public String deleteCombos(@PathVariable("id") String id) {
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Combos eliminados satisfactoriamente " + id;
    }
}
