package com.develogment.sod.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Salary.class)
public abstract class Salary_ {

	public static volatile SingularAttribute<Salary, Date> toDate;
	public static volatile SingularAttribute<Salary, SalaryId> id;
	public static volatile SingularAttribute<Salary, Employee> employee;
	public static volatile SingularAttribute<Salary, Integer> salary;

	public static final String TO_DATE = "toDate";
	public static final String ID = "id";
	public static final String EMPLOYEE = "employee";
	public static final String SALARY = "salary";

}

