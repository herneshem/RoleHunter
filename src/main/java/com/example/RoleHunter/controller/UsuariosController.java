package com.example.RoleHunter.controller;

<<<<<<< HEAD

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

=======
public class UsuariosController {
>>>>>>> 6a0bd633a5a0c9aacc022cc2f7eefe18efe44209
}
