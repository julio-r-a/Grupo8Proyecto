package com.example.restpractica.Repository;

import com.example.restpractica.Entity.Cantante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICantanteRepository extends JpaRepository<Cantante, Integer> {
}
