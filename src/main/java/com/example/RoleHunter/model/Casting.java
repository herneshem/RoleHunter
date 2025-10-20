package com.example.RoleHunter.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Casting")
public class Casting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Casting;
    private String tipo;
    private String ciudad;
    private String ifRequired; // si es actor, modelo, etc

    public Long getId_Casting() {
        return id_Casting;
    }

    public String getifRequired() {
        return ifRequired;
    }

    public void setifRequired(String ifRequired) {
        this.ifRequired = ifRequired;
    }

    public void setId_Casting(Long id_Casting) {
        this.id_Casting = id_Casting;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
