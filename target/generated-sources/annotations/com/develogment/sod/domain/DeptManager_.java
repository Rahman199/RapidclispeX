package com.develogment.sod.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DeptManager.class)
public abstract class DeptManager_ {

	public static volatile SingularAttribute<DeptManager, Date> fromDate;
	public static volatile SingularAttribute<DeptManager, Date> toDate;
	public static volatile SingularAttribute<DeptManager, DeptManagerId> id;
	public static volatile SingularAttribute<DeptManager, Department> department;
	public static volatile SingularAttribute<DeptManager, Employee> employee;

	public static final String FROM_DATE = "fromDate";
	public static final String TO_DATE = "toDate";
	public static final String ID = "id";
	public static final String DEPARTMENT = "department";
	public static final String EMPLOYEE = "employee";

}

