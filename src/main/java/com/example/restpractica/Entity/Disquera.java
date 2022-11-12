package com.example.restpractica.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "disquera")
public class Disquera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDisquera;
    private String nombre;
    private Integer anios;

    @OneToMany (mappedBy = "disquera", cascade = {CascadeType.MERGE})
    private List<Cantante> cantantes = new ArrayList<>();

    public Disquera() {
    }

    public Disquera(Integer idDisquera, String nombre, Integer anios, List<Cantante> cantantes) {
        this.idDisquera = idDisquera;
        this.nombre = nombre;
        this.anios = anios;
        this.cantantes = cantantes;
    }

    public Integer getIdDisquera() {
        return idDisquera;
    }

    public void setIdDisquera(Integer idDisquera) {
        this.idDisquera = idDisquera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAnios() {
        return anios;
    }

    public void setAnios(Integer anios) {
        this.anios = anios;
    }

    public List<Cantante> getCantantes() {
        return cantantes;
    }

    public void setCantantes(List<Cantante> cantantes) {
        this.cantantes = cantantes;
    }
}
