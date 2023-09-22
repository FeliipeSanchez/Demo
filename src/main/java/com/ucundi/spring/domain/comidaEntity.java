package com.ucundi.spring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class comidaEntity {

    public comidaEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private String peso;
    private String marca;
    private Integer precio;
    private String raza;
    
    
    


    public comidaEntity(String nombre, String peso, String marca, Integer precio, String raza) {
        this.nombre = nombre;
        this.peso = peso;
        this.marca = marca;
        this.precio = precio;
        this.raza = raza;
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


    public String getPeso() {
        return peso;
    }


    public void setPeso(String peso) {
        this.peso = peso;
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


    @Override
    public String toString() {
        return "comidaEntity [id=" + id + ", nombre=" + nombre + ", peso=" + peso + ", marca=" + marca + ", precio="
                + precio + ", raza=" + raza + "]";
    }
    
}
