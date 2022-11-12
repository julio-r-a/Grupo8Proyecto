package com.example.restpractica.Repository;

import com.example.restpractica.Entity.Disquera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDisqueraRepository extends JpaRepository<Disquera, Integer> {
}
