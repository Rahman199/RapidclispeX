package com.develogment.sod.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FilmActor.class)
public abstract class FilmActor_ {

	public static volatile SingularAttribute<FilmActor, Actor> actor;
	public static volatile SingularAttribute<FilmActor, Date> lastUpdate;
	public static volatile SingularAttribute<FilmActor, FilmActorId> id;
	public static volatile SingularAttribute<FilmActor, Film> film;

	public static final String ACTOR = "actor";
	public static final String LAST_UPDATE = "lastUpdate";
	public static final String ID = "id";
	public static final String FILM = "film";

}

