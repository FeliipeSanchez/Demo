package com.ucundi.spring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ropaEntity {
    
    public ropaEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private String marca;
    private Integer precio;
    private String raza;
    private String color;

    public ropaEntity(String nombre, String marca, Integer precio, String raza, String color) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.raza = raza;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    
    @Override
    public String toString() {
        return "ropaEntity [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", raza="
                + raza + ", color=" + color + "]";
    }


}
