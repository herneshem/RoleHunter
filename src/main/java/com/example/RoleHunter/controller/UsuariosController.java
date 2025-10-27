package com.example.RoleHunter.controller;


import com.example.RoleHunter.model.Casting;
import com.example.RoleHunter.model.Usuarios;
import com.example.RoleHunter.service.ServicioCasting;
import com.example.RoleHunter.service.ServicioUser;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/usuarios")

public class UsuariosController {

    private final ServicioUser serviciouser;

    public UsuariosController(ServicioUser serviciouser) {
        this.serviciouser = serviciouser;
    }


    @GetMapping("/user")
    public String viewCast(){

        return "serviciouser.list()";
    }


    @PostMapping("/newuser")
    public Usuarios createUsuarios(@RequestBody Usuarios usuarios) {
        return serviciouser.save(usuarios);
    }
}



