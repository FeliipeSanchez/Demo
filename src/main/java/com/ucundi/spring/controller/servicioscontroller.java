package com.ucundi.spring.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ucundi.spring.domain.serviciosEntity;
import com.ucundi.spring.repositories.serviciosRepositories;

@RestController
@RequestMapping("/api")
public class servicioscontroller {

    private final serviciosRepositories serviceRepo;

    @Autowired
    public servicioscontroller(serviciosRepositories serviceRepo) {
        this.serviceRepo = serviceRepo;
    }

    @GetMapping("/createServices")
    public String addServicios() {
        return "Servicio adicionado satisfactoriamente";
    }

    @GetMapping("/createServices/{id}")
    public String createServices(@PathVariable("id") String id) {
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Servicio creado satisfactoriamente " + id;
    }

    @GetMapping("/readServices")
    public String readServicios() {
        return "Servicio encontrado satisfactoriamente";
    }

    @GetMapping("/readServices/{id}")
    public Optional<serviciosEntity> readServices(@PathVariable("id") String id) {
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return serviceRepo.findById(Long.valueOf(id));
    }

    @GetMapping("/updateServices")
    public String updateServicios() {
        return "Servicio actualizado satisfactoriamente";
    }

    @GetMapping("/updateServices/{id}")
    public String updateServices(@PathVariable("id") String id) {
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Servicio actualizado satisfactoriamente " + id;
    }

    @GetMapping("/deleteServices")
    public String deleteServicios() {
        return "Servicio eliminado satisfactoriamente";
    }

    @GetMapping("/deleteServices/{id}")
    public String deleteServices(@PathVariable("id") String id) {
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
        if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
        return "Servicio eliminado satisfactoriamente " + id;
    }
}
