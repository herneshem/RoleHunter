package com.example.RoleHunter.model;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "proyectos")
public class Proyectos {

    @Id
    private String id_proyecto;

    private String ciudad;
    private int  duracion;


}
