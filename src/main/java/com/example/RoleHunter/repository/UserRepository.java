package com.example.RoleHunter.repository;

import com.example.RoleHunter.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuarios, Long> {
    Usuarios findByNombre(String nombre);
}
