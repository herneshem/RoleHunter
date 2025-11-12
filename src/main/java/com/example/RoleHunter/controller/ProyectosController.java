package com.example.RoleHunter.controller;


import com.example.RoleHunter.model.Proyectos;
import com.example.RoleHunter.repository.ProyectosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/typeproyect")
public class ProyectosController {

    @Autowired
    private ProyectosRepository proyectosRepository;


    @GetMapping
    public List<Proyectos> getAllProyectos() {
        return proyectosRepository.findAll();
    }
    @PostMapping
    public Proyectos createProyecto(@RequestBody Proyectos proyecto) {
        return proyectosRepository.save(proyecto);
    }
}
