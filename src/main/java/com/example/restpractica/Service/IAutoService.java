package com.example.restpractica.Service;

import com.example.restpractica.Entity.Auto;

import java.util.List;

public interface IAutoService {
    public void guardar(Auto auto);
    public void actualizar(Auto auto);
    public void eliminar(Integer id);
    List<Auto> list();
    Auto obtener(Integer id);
}
