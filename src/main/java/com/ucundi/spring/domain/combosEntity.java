package com.ucundi.spring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class combosEntity {

    

    public combosEntity() {
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String precio;
    private String descuento;
    private String id1;
    private String id2;
    private String id3;

    
    
    public combosEntity(String nombre, String precio, String descuento, String id1, String id2, String id3) {
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
        this.id1 = id1;
        this.id2 = id2;
        this.id3 = id3;
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


    public String getPrecio() {
        return precio;
    }


    public void setPrecio(String precio) {
        this.precio = precio;
    }


    public String getDescuento() {
        return descuento;
    }


    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }


    public String getId1() {
        return id1;
    }


    public void setId1(String id1) {
        this.id1 = id1;
    }


    public String getId2() {
        return id2;
    }


    public void setId2(String id2) {
        this.id2 = id2;
    }


    public String getId3() {
        return id3;
    }


    public void setId3(String id3) {
        this.id3 = id3;
    }


    @Override
    public String toString() {
        return "combosEntity [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", descuento=" + descuento
                + ", id1=" + id1 + ", id2=" + id2 + ", id3=" + id3 + "]";
    }


}
