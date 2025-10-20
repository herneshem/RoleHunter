package com.example.RoleHunter.controller;


import com.example.RoleHunter.model.Casting;
import com.example.RoleHunter.service.ServicioCasting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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

}
