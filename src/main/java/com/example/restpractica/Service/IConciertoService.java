package com.example.restpractica.Service;

import com.example.restpractica.Entity.Concierto;

import java.util.List;

public interface IConciertoService {
    public void guardar(Concierto concierto);
    public void actualizar(Concierto concierto);
    public void eliminar(Integer id);
    List<Concierto> list();
    Concierto obtener(Integer id);
}
