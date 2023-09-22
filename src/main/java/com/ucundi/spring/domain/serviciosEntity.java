package com.ucundi.spring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class serviciosEntity {

    public serviciosEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Tipo;
    private String Tiempo;
    private Integer Precio;
    private String Animal;
    private String raza;

    public serviciosEntity(String tipo, String tiempo, Integer precio, String animal, String raza) {
        this.Tipo = tipo;
        this.Tiempo = tiempo;
        this.Precio = precio;
        this.Animal = animal;
        this.raza = raza;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getTiempo() {
        return Tiempo;
    }

    public void setTiempo(String tiempo) {
        Tiempo = tiempo;
    }

    public Integer getPrecio() {
        return Precio;
    }

    public void setPrecio(Integer precio) {
        Precio = precio;
    }

    public String getAnimal() {
        return Animal;
    }

    public void setAnimal(String animal) {
        Animal = animal;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "serviciosEntity [id=" + id + ", Tipo=" + Tipo + ", Tiempo=" + Tiempo + ", Precio=" + Precio
                + ", Animal=" + Animal + ", raza=" + raza + "]";
    }


    
}
