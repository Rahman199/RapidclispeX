package com.develogment.sod.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, Date> createdAt;
	public static volatile SingularAttribute<User, Integer> iduser;
	public static volatile SingularAttribute<User, String> password;
	public static volatile SingularAttribute<User, String> username;

	public static final String CREATED_AT = "createdAt";
	public static final String IDUSER = "iduser";
	public static final String PASSWORD = "password";
	public static final String USERNAME = "username";

}

