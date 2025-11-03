package com.example.RoleHunter.controller;


import com.example.RoleHunter.model.Casting;
import com.example.RoleHunter.service.ServicioCasting;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/casting")
@Tag(name = "EndpointCasting", description = "casting")
public class CastingController {

    private final ServicioCasting servicecasting;

    public CastingController(ServicioCasting servicecasting) {
        this.servicecasting = servicecasting;
    }

    @Operation(summary = "Obtener recurso", description = "Devuelve los campos de casting")
    @GetMapping
    public List<Casting> list(){
        return servicecasting.list();
    }


    @GetMapping("/{id_Casting}")
    public Casting getCasting(@PathVariable Long id_Casting){

        return servicecasting.getCasting(id_Casting);
    }


    @PostMapping
    public Casting createCasting(@RequestBody Casting casting) {
        return servicecasting.save(casting);
    }

}
