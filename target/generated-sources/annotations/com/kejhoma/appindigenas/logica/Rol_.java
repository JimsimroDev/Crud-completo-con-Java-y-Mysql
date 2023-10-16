package com.kejhoma.appindigenas.logica;

import com.kejhoma.appindigenas.logica.User;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-15T21:36:47", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile SingularAttribute<Rol, String> descripcion;
    public static volatile ListAttribute<Rol, User> listaUsuarios;
    public static volatile SingularAttribute<Rol, String> nombreRol;
    public static volatile SingularAttribute<Rol, Integer> id;

}