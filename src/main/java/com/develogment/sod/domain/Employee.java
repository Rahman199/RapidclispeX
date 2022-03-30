
package com.develogment.sod.domain;

import com.develogment.sod.dal.EmployeeDAO;
import com.rapidclipse.framework.server.data.DAO;
import com.rapidclipse.framework.server.resources.Caption;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Employee
 */
@DAO(EmployeeDAO.class)
@Caption("{%firstName}")
@Entity
@Cacheable(true)
@Table(name = "employees", catalog = "employees")
public class Employee implements java.io.Serializable
{
	
	private int              empNo;
	private Date             birthDate;
	private String           firstName;
	private String           lastName;
	private char             gender;
	private Date             hireDate;
	private Set<DeptEmp>     deptEmps_1       = new HashSet<DeptEmp>(0);
	private Set<Salary>      salaries         = new HashSet<Salary>(0);
	private Set<Title>       titles_1         = new HashSet<Title>(0);
	private Set<DeptManager> deptManagers_1   = new HashSet<DeptManager>(0);
	private Set<Salary>      salaries_1       = new HashSet<Salary>(0);
	private Set<DeptEmp>     deptEmps_1_1     = new HashSet<DeptEmp>(0);
	private Set<DeptManager> deptManagers_1_1 = new HashSet<DeptManager>(0);
	private Set<Title>       titles_1_1       = new HashSet<Title>(0);
	
	public Employee()
	{
	}
	
	@Caption("EmpNo")
	@Id
	
	@Column(name = "emp_no", unique = true, nullable = false, columnDefinition = "INT")
	public int getEmpNo()
	{
		return this.empNo;
	}
	
	public void setEmpNo(int empNo)
	{
		this.empNo = empNo;
	}
	
	@Caption("BirthDate")
	@Temporal(TemporalType.DATE)
	@Column(name = "birth_date", nullable = false, columnDefinition = "DATE", length = 10)
	public Date getBirthDate()
	{
		return this.birthDate;
	}
	
	public void setBirthDate(Date birthDate)
	{
		this.birthDate = birthDate;
	}
	
	@Caption("FirstName")
	@Column(name = "first_name", nullable = false, columnDefinition = "VARCHAR", length = 14)
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	@Caption("LastName")
	@Column(name = "last_name", nullable = false, columnDefinition = "VARCHAR", length = 16)
	public String getLastName()
	{
		return this.lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	@Caption("Gender")
	@Column(name = "gender", nullable = false, columnDefinition = "ENUM", length = 1)
	public char getGender()
	{
		return this.gender;
	}
	
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	
	@Caption("HireDate")
	@Temporal(TemporalType.DATE)
	@Column(name = "hire_date", nullable = false, columnDefinition = "DATE", length = 10)
	public Date getHireDate()
	{
		return this.hireDate;
	}
	
	public void setHireDate(Date hireDate)
	{
		this.hireDate = hireDate;
	}
	
	@Caption("DeptEmps 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public Set<DeptEmp> getDeptEmps_1()
	{
		return this.deptEmps_1;
	}
	
	public void setDeptEmps_1(Set<DeptEmp> deptEmps_1)
	{
		this.deptEmps_1 = deptEmps_1;
	}
	
	@Caption("Salaries")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public Set<Salary> getSalaries()
	{
		return this.salaries;
	}
	
	public void setSalaries(Set<Salary> salaries)
	{
		this.salaries = salaries;
	}
	
	@Caption("Titles 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public Set<Title> getTitles_1()
	{
		return this.titles_1;
	}
	
	public void setTitles_1(Set<Title> titles_1)
	{
		this.titles_1 = titles_1;
	}
	
	@Caption("DeptManagers 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public Set<DeptManager> getDeptManagers_1()
	{
		return this.deptManagers_1;
	}
	
	public void setDeptManagers_1(Set<DeptManager> deptManagers_1)
	{
		this.deptManagers_1 = deptManagers_1;
	}
	
	@Caption("Salaries 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public Set<Salary> getSalaries_1()
	{
		return this.salaries_1;
	}
	
	public void setSalaries_1(Set<Salary> salaries_1)
	{
		this.salaries_1 = salaries_1;
	}
	
	@Caption("DeptEmps 1 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public Set<DeptEmp> getDeptEmps_1_1()
	{
		return this.deptEmps_1_1;
	}
	
	public void setDeptEmps_1_1(Set<DeptEmp> deptEmps_1_1)
	{
		this.deptEmps_1_1 = deptEmps_1_1;
	}
	
	@Caption("DeptManagers 1 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public Set<DeptManager> getDeptManagers_1_1()
	{
		return this.deptManagers_1_1;
	}
	
	public void setDeptManagers_1_1(Set<DeptManager> deptManagers_1_1)
	{
		this.deptManagers_1_1 = deptManagers_1_1;
	}
	
	@Caption("Titles 1 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public Set<Title> getTitles_1_1()
	{
		return this.titles_1_1;
	}
	
	public void setTitles_1_1(Set<Title> titles_1_1)
	{
		this.titles_1_1 = titles_1_1;
	}
	
}
