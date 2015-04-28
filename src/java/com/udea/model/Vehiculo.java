/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.udea.model;

import java.io.Serializable;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * 
 * @author jorgel.diaz <jlditru@gmail.com>
 */
@Entity
@Table
@NamedQueries(@NamedQuery(name = "Vehiculo.getAll", query = "SELECT v FROM Vehiculo v"))
public class Vehiculo implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column
private String matricula;
@Column
private String modelo;
@Column
private String color;
@Column
private int cantidad;
@Column
private Double precio;
@Column
private Blob foto;

    public Vehiculo() {
    }   

    public Vehiculo(String matricula, String modelo, String color, int cantidad, Double precio, Blob foto) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.cantidad = cantidad;
        this.precio = precio;
        this.foto = foto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Blob getFoto() {
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
    }
}
