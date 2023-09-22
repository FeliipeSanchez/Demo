package com.ucundi.spring.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ucundi.spring.domain.camasEntity;
import com.ucundi.spring.repositories.camasRepositories;

@RestController
@RequestMapping("/api")
public class camascontroller {

    private final camasRepositories camsRepo;

    @Autowired
    public camascontroller(camasRepositories camsRepo) {
        this.camsRepo = camsRepo;
    }

    @GetMapping("/createCams")
    public String addCamas() {
        return "Cama adicionada satisfactoriamente";
    }

    @GetMapping("/createCams/{id}")
    public String addCamas(@PathVariable("id") String id) {
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Cama encontrada satisfactoriamente " + id;
    }

    @GetMapping("/readCams")
    public String readCamas() {
        return "Cama encontrada satisfactoriamente";
    }

    @GetMapping("/readCams/{id}")
    public Optional<camasEntity> readCamas(@PathVariable("id") String id) {
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return camsRepo.findById(Long.valueOf(id));
    }

    @GetMapping("/updateCams")
    public String updateCamas() {
        return "Cama actualizada satisfactoriamente";
    }

    @GetMapping("/updateCams/{id}")
    public String updateCamas(@PathVariable("id") String id) {
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Cama ctualizada satisfactoriamente " + id;
    }

    @GetMapping("/deleteCams")
    public String deleteCamas() {
        return "Cama eliminada satisfactoriamente";
    }

    @GetMapping("/deleteCams/{id}")
    public String deleteCamas(@PathVariable("id") String id) {
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Cama eliminada satisfactoriamente " + id;
    }
}
