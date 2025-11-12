package com.example.RoleHunter.model;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "proyectos")
public class Proyectos {

    @Id
    private String id_proyecto;

    private String titulo;
    private String fechas;
    private String sexartist;
    private String altura;
    private String lugar;

    private String edad;
    private String  remunerado;

    public String getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(String id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechas() {
        return fechas;
    }

    public void setFechas(String fechas) {
        this.fechas = fechas;
    }

    public String getSexartist() {
        return sexartist;
    }

    public void setSexartist(String sexartist) {
        this.sexartist = sexartist;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getRemunerado() {
        return remunerado;
    }

    public void setRemunerado(String remunerado) {
        this.remunerado = remunerado;
    }
}
