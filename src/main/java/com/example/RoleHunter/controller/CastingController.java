package com.example.RoleHunter.controller;


import com.example.RoleHunter.model.Casting;
import com.example.RoleHunter.service.ServicioCasting;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController

@CrossOrigin(origins = "http://localhost:4200")


@RequestMapping("/casting")
public class CastingController {

    private final ServicioCasting servicecasting;

    public CastingController(ServicioCasting servicecasting) {
        this.servicecasting = servicecasting;
    }

    @GetMapping
    public List<Casting> list(){
        return servicecasting.list();
    }
    @GetMapping("/view")
    public String viewCast(){

        return "servicecasting.list()";
    }


    @PostMapping
    public Casting createCasting(@RequestBody Casting casting) {
        return servicecasting.save(casting);
    }

}
