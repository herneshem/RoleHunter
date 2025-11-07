package com.example.RoleHunter.repository;

import com.example.RoleHunter.model.Proyectos;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProyectosRepository extends MongoRepository<Proyectos, String> {
}
