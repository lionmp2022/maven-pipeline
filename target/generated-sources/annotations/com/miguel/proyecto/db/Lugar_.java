package com.miguel.proyecto.db;

import com.miguel.proyecto.db.Comentario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-03-09T12:55:41")
@StaticMetamodel(Lugar.class)
public class Lugar_ { 

    public static volatile SingularAttribute<Lugar, String> latitud;
    public static volatile SingularAttribute<Lugar, String> longitud;
    public static volatile ListAttribute<Lugar, Comentario> comentarioList;
    public static volatile SingularAttribute<Lugar, Long> id;
    public static volatile SingularAttribute<Lugar, String> nombre;

}