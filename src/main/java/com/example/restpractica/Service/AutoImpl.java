package com.example.restpractica.Service;

import com.example.restpractica.Entity.Auto;
import com.example.restpractica.Repository.IAutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoImpl implements IAutoService{

    @Autowired
    IAutoRepository repository;

    @Override
    public void guardar(Auto auto) {
        repository.save(auto);
    }

    @Override
    public void actualizar(Auto auto) {
        repository.saveAndFlush(auto);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Auto> list() {
        return repository.findAll();
    }

    @Override
    public Auto obtener(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
