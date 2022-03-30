package com.develogment.sod.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Department.class)
public abstract class Department_ {

	public static volatile SingularAttribute<Department, String> deptName;
	public static volatile SetAttribute<Department, DeptManager> deptManagers_1_1;
	public static volatile SetAttribute<Department, DeptManager> deptManagers_1;
	public static volatile SetAttribute<Department, DeptEmp> deptEmps_1;
	public static volatile SingularAttribute<Department, String> deptNo;
	public static volatile SetAttribute<Department, DeptEmp> deptEmps_1_1;

	public static final String DEPT_NAME = "deptName";
	public static final String DEPT_MANAGERS_1_1 = "deptManagers_1_1";
	public static final String DEPT_MANAGERS_1 = "deptManagers_1";
	public static final String DEPT_EMPS_1 = "deptEmps_1";
	public static final String DEPT_NO = "deptNo";
	public static final String DEPT_EMPS_1_1 = "deptEmps_1_1";

}

