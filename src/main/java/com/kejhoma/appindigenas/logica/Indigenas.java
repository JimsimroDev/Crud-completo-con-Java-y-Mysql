package com.kejhoma.appindigenas.logica;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Indigenas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numeroDoc;
    private String tipoDoc;
    private String nombre;
    private String apellido;
    private String fecha_nac;

    public Indigenas() {
    }

    public Indigenas(int id, int numeroDoc, String tipoDoc, String nombre, String apellido, String fecha_nac) {
        this.id = id;
        this.numeroDoc = numeroDoc;
        this.tipoDoc = tipoDoc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDoc() {
        return this.tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getNumeroDoc() {
        return this.numeroDoc;
    }

    public void setNumeroDoc(int numeroDoc) {
        this.numeroDoc = numeroDoc;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

}
