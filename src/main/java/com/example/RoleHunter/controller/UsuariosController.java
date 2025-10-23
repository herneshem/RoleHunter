package com.example.RoleHunter.controller;


import com.example.RoleHunter.service.ServicioCasting;
import com.example.RoleHunter.service.ServicioUser;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping
public class UsuariosController {

    private final ServicioUser serviceuser;

    public  UsuariosController(ServicioUser serviceCasting){
        this.serviceuser = serviceCasting;

    }

}
