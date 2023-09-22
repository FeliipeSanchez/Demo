package com.ucundi.spring.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ucundi.spring.domain.ropaEntity;
import com.ucundi.spring.repositories.ropaRepositories;

@RestController
@RequestMapping("/api")
public class ropacontroller {

    private final ropaRepositories ropaRepo;

    @Autowired
    public ropacontroller(ropaRepositories ropaRepo) {
        this.ropaRepo = ropaRepo;
    }

    @GetMapping("/createRopa")
    public String addRopa() {
        return "Ropa adicionada satisfactoriamente";
    }

    @GetMapping("/createRopa/{id}")
    public String createRopa(@PathVariable("id") String id) {
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Ropa creada satisfactoriamente " + id;
    }

    @GetMapping("/readRopa")
    public String readRopa() {
        return "Ropa encontrada satisfactoriamente";
    }

    @GetMapping("/readRopa/{id}")
    public Optional<ropaEntity> readRopa(@PathVariable("id") String id) {
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return ropaRepo.findById(Long.valueOf(id));
    }

    @GetMapping("/updateRopa")
    public String updateRopa() {
        return "Ropa actualizada satisfactoriamente";
    }

    @GetMapping("/updateRopa/{id}")
    public String updateRopa(@PathVariable("id") String id) {
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Ropa actualizada satisfactoriamente " + id;
    }

    @GetMapping("/deleteRopa")
    public String deleteRopa() {
        return "Ropa eliminada satisfactoriamente";
    }

    @GetMapping("/deleteRopa/{id}")
    public String deleteRopa(@PathVariable("id") String id) {
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Ropa eliminada satisfactoriamente " + id;
    }
}
