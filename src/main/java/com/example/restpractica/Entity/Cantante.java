package com.example.restpractica.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "cantantes")
public class Cantante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCantante;
    private String nombre;
    private Integer edad;

    @ManyToOne
    @JoinColumn(
            name ="id_disquera",
            nullable = false,
            unique = true,
            foreignKey =  @ForeignKey(foreignKeyDefinition = "foreign key (id_disquera) references disquera(id_disquera)")
    )
    private Disquera disquera;

    @OneToOne
    Auto auto;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "agenda",
            joinColumns = @JoinColumn(
                    name = "id_cantante",
                    nullable = false,
                    unique = true,
                    foreignKey =  @ForeignKey(foreignKeyDefinition = "foreign key (id_cantante) references cantantes(id_cantante)")
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "id_concierto",
                    nullable = false,
                    unique = true,
                    foreignKey =  @ForeignKey(foreignKeyDefinition = "foreign key (id_concierto) references concierto(id_concierto)")
            )
    )
    private List<Concierto> conciertos = new ArrayList<>();

    public Cantante() {
    }

    public Cantante(Integer idCantante, String nombre, Integer edad, Disquera disquera, Auto auto, List<Concierto> conciertos) {
        this.idCantante = idCantante;
        this.nombre = nombre;
        this.edad = edad;
        this.disquera = disquera;
        this.auto = auto;
        this.conciertos = conciertos;
    }

    public Integer getIdCantante() {
        return idCantante;
    }

    public void setIdCantante(Integer idCantante) {
        this.idCantante = idCantante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Disquera getDisquera() {
        return disquera;
    }

    public void setDisquera(Disquera disquera) {
        this.disquera = disquera;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public List<Concierto> getConciertos() {
        return conciertos;
    }

    public void setConciertos(List<Concierto> conciertos) {
        this.conciertos = conciertos;
    }
}
