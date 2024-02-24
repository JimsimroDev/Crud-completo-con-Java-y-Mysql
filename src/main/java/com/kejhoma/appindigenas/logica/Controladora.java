package com.kejhoma.appindigenas.logica;

import com.kejhoma.appindigenas.perisntencia.exceptions.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis;

    public Controladora() {

        controlPersis = new ControladoraPersistencia();

    }

    public User validarUsuario(String usuario, String contrasena) {
        User usr = null;
        List<User> listaUsuarios = controlPersis.traerUsuarios();
        for (User usu : listaUsuarios) {
            if (usuario.equals(usu.getNombreUsu())) {
                if (contrasena.equals(usu.getContrasenia())) {
                    usr = usu;
                    return usr;
                } else {
                    usr = null;
                    return usr;
                }

            } else {
                usr = null;
                //return usr;
            }
        }

        return usr;
    }

    public List<Indigenas> traerIndigenas() {
        return controlPersis.traerIndigenas();
    }

    public List<User> traerUsuarios() {
        return controlPersis.traerUsuarios();
    }

    public void borrarIndigenas(int id_indigenas) {
        controlPersis.borrarIndigenas(id_indigenas);
    }

    public void borrarUsuarios(int id_usuarios) {
        controlPersis.borrarUsuarios(id_usuarios);
    }

    public void crearIndigena(String tipoDoc, int numeroDoc, String nombre, String apellido, String fechaNac) {
        Indigenas indig = new Indigenas();
        indig.setTipoDoc(tipoDoc);
        indig.setNumeroDoc(numeroDoc);
        indig.setNombre(nombre);
        indig.setApellido(apellido);
        indig.setFecha_nac(fechaNac);

        controlPersis.crearIdigena(indig);
    }

    public List<Rol> traerRoles() {
        return controlPersis.traerRoles();
    }

    public void crearUsuario(String usuario, String contra, String rolRecibido) {

        User usr = new User();
        usr.setNombreUsu(usuario);
        usr.setContrasenia(contra);

        //Hay que buscar el rol en la base de datos
        Rol rolEncontrado = new Rol();
        rolEncontrado = this.traerRol(rolRecibido);
        if (rolEncontrado != null) {
            usr.setUnRol(rolEncontrado);
        }

        int id = this.buscarUltimaIdUsuarios();
        usr.setId(id + 1);

        controlPersis.craerUsuarios(usr);
    }

    private Rol traerRol(String rolRecibido) {
        List<Rol> listaRoles = controlPersis.traerRoles();
        for (Rol rol : listaRoles) {
            if (rol.getNombreRol().equals(rolRecibido)) {
                return rol;
            }
        }
        return null;
    }

    private int buscarUltimaIdUsuarios() {
        List<User> listaUsuarios = this.traerUsuarios();
        //tengo que traer el ultimo Usuario
        User usr = listaUsuarios.get(listaUsuarios.size() - 1);
        return usr.getId();
    }

    public Indigenas traerIndigena(int id_indigenas) {
        return controlPersis.traerIndigena(id_indigenas);
    }

    public void editarIndigena(Indigenas indi, String tipoDoc, int numeroDoc,
            String nombre, String apellido, String fechaNac) {
        indi.setTipoDoc(tipoDoc);
        indi.setNumeroDoc(numeroDoc);
        indi.setNombre(nombre);
        indi.setApellido(apellido);
        indi.setFecha_nac(fechaNac);

        controlPersis.editarIndigena(indi);

    }

    public User traerUsuario(int id_usuarios) {
        return controlPersis.traerUsuario(id_usuarios);
    }

    public void editarUsuario(User usr, String usuario, String contra, String rolRecibido) {
        usr.setNombreUsu(usuario);
        usr.setContrasenia(contra);
        
        
        Rol rolEncontrado = new Rol();
        rolEncontrado = this.traerRol(rolRecibido);
        if (rolEncontrado != null) {
            usr.setUnRol(rolEncontrado);
        }
        
        controlPersis.editarUsuario(usr);
        
    }

}
