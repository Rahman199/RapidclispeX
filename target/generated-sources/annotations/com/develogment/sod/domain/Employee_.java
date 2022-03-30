package com.develogment.sod.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Employee.class)
public abstract class Employee_ {

	public static volatile SingularAttribute<Employee, String> lastName;
	public static volatile SingularAttribute<Employee, Date> hireDate;
	public static volatile SetAttribute<Employee, Title> titles_1_1;
	public static volatile SingularAttribute<Employee, Character> gender;
	public static volatile SetAttribute<Employee, DeptManager> deptManagers_1;
	public static volatile SetAttribute<Employee, Title> titles_1;
	public static volatile SingularAttribute<Employee, Integer> empNo;
	public static volatile SingularAttribute<Employee, Date> birthDate;
	public static volatile SetAttribute<Employee, DeptEmp> deptEmps_1_1;
	public static volatile SingularAttribute<Employee, String> firstName;
	public static volatile SetAttribute<Employee, DeptManager> deptManagers_1_1;
	public static volatile SetAttribute<Employee, Salary> salaries;
	public static volatile SetAttribute<Employee, DeptEmp> deptEmps_1;
	public static volatile SetAttribute<Employee, Salary> salaries_1;

	public static final String LAST_NAME = "lastName";
	public static final String HIRE_DATE = "hireDate";
	public static final String TITLES_1_1 = "titles_1_1";
	public static final String GENDER = "gender";
	public static final String DEPT_MANAGERS_1 = "deptManagers_1";
	public static final String TITLES_1 = "titles_1";
	public static final String EMP_NO = "empNo";
	public static final String BIRTH_DATE = "birthDate";
	public static final String DEPT_EMPS_1_1 = "deptEmps_1_1";
	public static final String FIRST_NAME = "firstName";
	public static final String DEPT_MANAGERS_1_1 = "deptManagers_1_1";
	public static final String SALARIES = "salaries";
	public static final String DEPT_EMPS_1 = "deptEmps_1";
	public static final String SALARIES_1 = "salaries_1";

}

