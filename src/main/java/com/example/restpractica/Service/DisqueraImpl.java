package com.example.restpractica.Service;

import com.example.restpractica.Entity.Disquera;
import com.example.restpractica.Repository.IDisqueraRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DisqueraImpl implements IDisqueraService{

    @Autowired
    IDisqueraRepository repository;

    @Override
    public void guardar(Disquera disquera) {
        repository.save(disquera);
    }

    @Override
    public void actualizar(Disquera disquera) {
        repository.saveAndFlush(disquera);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Disquera> list() {
        return repository.findAll();
    }

    @Override
    public Disquera obtener(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
