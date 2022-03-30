package com.develogment.sod.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ActorInfoId.class)
public abstract class ActorInfoId_ {

	public static volatile SingularAttribute<ActorInfoId, String> firstName;
	public static volatile SingularAttribute<ActorInfoId, String> lastName;
	public static volatile SingularAttribute<ActorInfoId, Short> actorId;
	public static volatile SingularAttribute<ActorInfoId, String> filmInfo;

	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String ACTOR_ID = "actorId";
	public static final String FILM_INFO = "filmInfo";

}

