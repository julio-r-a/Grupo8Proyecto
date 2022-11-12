package com.example.restpractica.Service;

import com.example.restpractica.Entity.Concierto;
import com.example.restpractica.Repository.IConciertoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConciertoImpl implements IConciertoService{

    @Autowired
    IConciertoRepository repository;

    @Override
    public void guardar(Concierto concierto) {
        repository.save(concierto);
    }

    @Override
    public void actualizar(Concierto concierto) {
        repository.saveAndFlush(concierto);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Concierto> list() {
        return repository.findAll();
    }

    @Override
    public Concierto obtener(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
