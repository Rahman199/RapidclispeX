package com.develogment.sod.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Title.class)
public abstract class Title_ {

	public static volatile SingularAttribute<Title, Date> toDate;
	public static volatile SingularAttribute<Title, TitleId> id;
	public static volatile SingularAttribute<Title, Employee> employee;

	public static final String TO_DATE = "toDate";
	public static final String ID = "id";
	public static final String EMPLOYEE = "employee";

}

