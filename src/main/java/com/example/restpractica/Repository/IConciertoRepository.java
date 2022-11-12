package com.example.restpractica.Repository;

import com.example.restpractica.Entity.Concierto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConciertoRepository extends JpaRepository<Concierto, Integer> {
}
