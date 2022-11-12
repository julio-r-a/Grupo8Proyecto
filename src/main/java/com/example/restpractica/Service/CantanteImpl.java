package com.example.restpractica.Service;

import com.example.restpractica.Entity.Cantante;
import com.example.restpractica.Repository.ICantanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CantanteImpl implements ICantanteService{

    @Autowired
    ICantanteRepository repository;

    @Override
    public void guardar(Cantante cantante) {
        repository.save(cantante);
    }

    @Override
    public void actualizar(Cantante cantante) {
        repository.saveAndFlush(cantante);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Cantante> list() {
        return repository.findAll();
    }

    @Override
    public Cantante obtener(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
