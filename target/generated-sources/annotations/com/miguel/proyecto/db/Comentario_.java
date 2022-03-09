package com.miguel.proyecto.db;

import com.miguel.proyecto.db.Lugar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-03-09T12:55:41")
@StaticMetamodel(Comentario.class)
public class Comentario_ { 

    public static volatile SingularAttribute<Comentario, Long> id;
    public static volatile SingularAttribute<Comentario, Lugar> lugarId;
    public static volatile SingularAttribute<Comentario, String> comentario;

}