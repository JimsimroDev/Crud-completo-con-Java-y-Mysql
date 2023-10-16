package com.kejhoma.appindigenas.logica;

import java.io.Serializable;
import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;*/
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User implements Serializable {

    @Id
    //esto no tien sentido @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombreUsu;
    private String contrasenia;

    @ManyToOne
    @JoinColumn(name = "fk_rol")
    private Rol unRol;

    public User() {

    }

    public User(int id, String nombreUsu, String contrasenia, Rol unRol) {
        this.id = id;
        this.nombreUsu = nombreUsu;
        this.contrasenia = contrasenia;
        this.unRol = unRol;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsu() {
        return this.nombreUsu;
    }

    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }

    public String getContrasenia() {
        return this.contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Rol getUnRol() {
        return this.unRol;
    }

    public void setUnRol(Rol unRol) {
        this.unRol = unRol;
    }

}
