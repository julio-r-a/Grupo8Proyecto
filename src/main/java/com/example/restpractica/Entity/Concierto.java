package com.example.restpractica.Entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "concierto")
public class Concierto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idConcierto;
    private String ubicacion;
    private Integer aforo;

    @ManyToMany(mappedBy = "conciertos")
    private List<Cantante> cantanteList = new ArrayList<>();

    public Concierto() {
    }

    public Concierto(Integer idConcierto, String ubicacion, Integer aforo, List<Cantante> cantanteList) {
        this.idConcierto = idConcierto;
        this.ubicacion = ubicacion;
        this.aforo = aforo;
        this.cantanteList = cantanteList;
    }

    public Integer getIdConcierto() {
        return idConcierto;
    }

    public void setIdConcierto(Integer idConcierto) {
        this.idConcierto = idConcierto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getAforo() {
        return aforo;
    }

    public void setAforo(Integer aforo) {
        this.aforo = aforo;
    }

    public List<Cantante> getCantanteList() {
        return cantanteList;
    }

    public void setCantanteList(List<Cantante> cantanteList) {
        this.cantanteList = cantanteList;
    }
}
