package com.example.RoleHunter.controller;


import com.example.RoleHunter.model.Casting;
import com.example.RoleHunter.model.Usuarios;
import com.example.RoleHunter.service.ServicioCasting;
import com.example.RoleHunter.service.ServicioUser;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/usuarios")
@Tag(name = "EndpointUusarios", description = "usuarios")
public class UsuariosController {

    private final ServicioUser serviciouser;

    public UsuariosController(ServicioUser serviciouser) {
        this.serviciouser = serviciouser;
    }

    @Operation(summary = "Obtener recurso", description = "Devuelve los campos de usuario")
    @GetMapping
    public List<Usuarios> List(){

        return serviciouser.list();
    }
    @PostMapping("/login")
    public Usuarios loginUser(@RequestBody Usuarios credentials) {
        return serviciouser.login(credentials.getNombre(), credentials.getPassword());
    }

    @Operation(summary = "Obtener recurso", description = "Devuelve los parametros de ids")
    @GetMapping("/{id_Usuario}")
    public Usuarios getUserRep(@PathVariable Long id_Usuario){

        return serviciouser.getUserRep(id_Usuario);
    }


    @Operation(summary = "Obtener datos", description = "Devuelve los campos")
    @PostMapping("/newuser")
    public Usuarios createUsuarios(@RequestBody Usuarios usuarios) {
        return serviciouser.save(usuarios);
    }
}



