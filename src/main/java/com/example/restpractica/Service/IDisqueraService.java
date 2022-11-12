package com.example.restpractica.Service;

import com.example.restpractica.Entity.Disquera;

import java.util.List;

public interface IDisqueraService {
    public void guardar(Disquera disquera);
    public void actualizar(Disquera disquera);
    public void eliminar(Integer id);
    List<Disquera> list();
    Disquera obtener(Integer id);
}
