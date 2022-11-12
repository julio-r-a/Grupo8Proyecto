package com.example.restpractica.Repository;

import com.example.restpractica.Entity.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutoRepository extends JpaRepository<Auto, Integer> {
}
