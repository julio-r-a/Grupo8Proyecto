package com.example.restpractica.Entity;

import javax.persistence.*;


@Entity
@Table(name = "auto")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAuto;
    private String marca;
    private String color;
    private String placa;

    @OneToOne
    Cantante cantante;

    public Auto() {
    }

    public Auto(Integer idAuto, String marca, String color, String placa, Cantante cantante) {
        this.idAuto = idAuto;
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.cantante = cantante;
    }

    public Integer getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(Integer idAuto) {
        this.idAuto = idAuto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Cantante getCantante() {
        return cantante;
    }

    public void setCantante(Cantante cantante) {
        this.cantante = cantante;
    }
}
