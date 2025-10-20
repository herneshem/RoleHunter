package com.example.RoleHunter.model;

import jakarta.persistence.*;

@Entity
@Table
public class Postulaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id_Postulacion;

   private  String nombrePostulacion;
   private float retribuible;

    public float getRetribuible() {
        return retribuible;
    }

    public void setRetribuible(float retribuible) {
        this.retribuible = retribuible;
    }

    public String getNombrePostulacion() {
        return nombrePostulacion;
    }

    public void setNombrePostulacion(String nombrePostulacion) {
        this.nombrePostulacion = nombrePostulacion;
    }

    public Long getId_Postulacion() {
        return id_Postulacion;
    }

    public void setId_Postulacion(Long id_Postulacion) {
        this.id_Postulacion = id_Postulacion;
    }
}
