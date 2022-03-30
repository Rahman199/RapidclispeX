package com.develogment.sod.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Log.class)
public abstract class Log_ {

	public static volatile SingularAttribute<Log, String> password;
	public static volatile SingularAttribute<Log, Integer> id;
	public static volatile SingularAttribute<Log, String> email;
	public static volatile SingularAttribute<Log, String> username;

	public static final String PASSWORD = "password";
	public static final String ID = "id";
	public static final String EMAIL = "email";
	public static final String USERNAME = "username";

}

