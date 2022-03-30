package com.develogment.sod.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CurrentDeptEmpId.class)
public abstract class CurrentDeptEmpId_ {

	public static volatile SingularAttribute<CurrentDeptEmpId, Date> fromDate;
	public static volatile SingularAttribute<CurrentDeptEmpId, Date> toDate;
	public static volatile SingularAttribute<CurrentDeptEmpId, Integer> empNo;
	public static volatile SingularAttribute<CurrentDeptEmpId, String> deptNo;

	public static final String FROM_DATE = "fromDate";
	public static final String TO_DATE = "toDate";
	public static final String EMP_NO = "empNo";
	public static final String DEPT_NO = "deptNo";

}

