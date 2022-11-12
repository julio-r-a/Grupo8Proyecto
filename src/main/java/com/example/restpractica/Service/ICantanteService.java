package com.example.restpractica.Service;

import com.example.restpractica.Entity.Cantante;

import java.util.List;

public interface ICantanteService {
    void guardar (Cantante cantante);
    void actualizar (Cantante cantante );
    void eliminar (Integer id);
    List<Cantante> list();
    Cantante obtener(Integer id);
}
