package com.kejhoma.appindigenas.perisntencia.exceptions;

import com.kejhoma.appindigenas.logica.Indigenas;
import com.kejhoma.appindigenas.logica.Rol;
import com.kejhoma.appindigenas.logica.User;
import com.kejhoma.appindigenas.perisntencia.IndigenasJpaController;
import com.kejhoma.appindigenas.perisntencia.RolJpaController;
import com.kejhoma.appindigenas.perisntencia.UserJpaController;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    IndigenasJpaController indigeJpa = new IndigenasJpaController();
    RolJpaController rolJpa = new RolJpaController();
    UserJpaController usrJpa = new UserJpaController();

    public List<User> traerUsuarios() {
        List<User> listaUsuarios = usrJpa.findUserEntities();
        return listaUsuarios;
    }

    public List<Indigenas> traerIndigenas() {
        List<Indigenas> listaIndigenas = indigeJpa.findIndigenasEntities();
        return listaIndigenas;
    }

    public void borrarIndigenas(int id_indigenas) {
        try {
            indigeJpa.destroy(id_indigenas);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarUsuarios(int id_usuarios) {
        try {
            usrJpa.destroy(id_usuarios);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearIdigena(Indigenas indig) {
        indigeJpa.create(indig);
    }

    public List<Rol> traerRoles() {
        return rolJpa.findRolEntities();
        //SELECT * FROM Roles
    }

    public void craerUsuarios(User usr) {
        try {
            usrJpa.create(usr);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Indigenas traerIndigena(int id_indigenas) {
        return indigeJpa.findIndigenas(id_indigenas);
    }

    public void editarIndigena(Indigenas indi) {
        try {
            indigeJpa.edit(indi);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public User traerUsuario(int id_usuarios) {
        return usrJpa.findUser(id_usuarios);
    }

    public void editarUsuario(User usr) {
        try {
            usrJpa.edit(usr);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
