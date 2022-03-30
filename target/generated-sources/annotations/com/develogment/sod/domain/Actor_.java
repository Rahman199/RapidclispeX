package com.develogment.sod.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Actor.class)
public abstract class Actor_ {

	public static volatile SingularAttribute<Actor, String> firstName;
	public static volatile SingularAttribute<Actor, String> lastName;
	public static volatile SingularAttribute<Actor, Short> actorId;
	public static volatile SingularAttribute<Actor, Date> lastUpdate;
	public static volatile SetAttribute<Actor, FilmActor> filmActors_1;
	public static volatile SetAttribute<Actor, FilmActor> filmActors_1_1;

	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String ACTOR_ID = "actorId";
	public static final String LAST_UPDATE = "lastUpdate";
	public static final String FILM_ACTORS_1 = "filmActors_1";
	public static final String FILM_ACTORS_1_1 = "filmActors_1_1";

}

