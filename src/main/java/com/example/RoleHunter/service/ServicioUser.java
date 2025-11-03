package com.example.RoleHunter.service;

import com.example.RoleHunter.model.Usuarios;
import com.example.RoleHunter.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioUser {


    private final UserRepository userRep;

    public ServicioUser (UserRepository userRep){this.userRep = userRep;}

    public List<Usuarios> list(){
        return userRep.findAll();
    }

    public Usuarios getUserRep(Long id_Usuario) {
        return userRep.findById(id_Usuario).orElse(null);
    }

    public Usuarios save(Usuarios usuarios) {
        return userRep.save(usuarios);
    }
}
