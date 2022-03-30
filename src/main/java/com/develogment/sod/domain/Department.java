
package com.develogment.sod.domain;

import com.develogment.sod.dal.DepartmentDAO;
import com.rapidclipse.framework.server.data.DAO;
import com.rapidclipse.framework.server.resources.Caption;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


/**
 * Department
 */
@DAO(DepartmentDAO.class)
@Caption("{%deptNo}")
@Entity
@Cacheable(true)
@Table(name = "departments", catalog = "employees", uniqueConstraints = @UniqueConstraint(columnNames = "dept_name"))
public class Department implements java.io.Serializable
{
	
	private String           deptNo;
	private String           deptName;
	private Set<DeptEmp>     deptEmps_1       = new HashSet<DeptEmp>(0);
	private Set<DeptManager> deptManagers_1   = new HashSet<DeptManager>(0);
	private Set<DeptEmp>     deptEmps_1_1     = new HashSet<DeptEmp>(0);
	private Set<DeptManager> deptManagers_1_1 = new HashSet<DeptManager>(0);
	
	public Department()
	{
	}
	
	@Caption("DeptNo")
	@Id
	
	@Column(name = "dept_no", unique = true, nullable = false, columnDefinition = "CHAR", length = 4)
	public String getDeptNo()
	{
		return this.deptNo;
	}
	
	public void setDeptNo(String deptNo)
	{
		this.deptNo = deptNo;
	}
	
	@Caption("DeptName")
	@Column(name = "dept_name", unique = true, nullable = false, columnDefinition = "VARCHAR", length = 40)
	public String getDeptName()
	{
		return this.deptName;
	}
	
	public void setDeptName(String deptName)
	{
		this.deptName = deptName;
	}
	
	@Caption("DeptEmps 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
	public Set<DeptEmp> getDeptEmps_1()
	{
		return this.deptEmps_1;
	}
	
	public void setDeptEmps_1(Set<DeptEmp> deptEmps_1)
	{
		this.deptEmps_1 = deptEmps_1;
	}
	
	@Caption("DeptManagers 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
	public Set<DeptManager> getDeptManagers_1()
	{
		return this.deptManagers_1;
	}
	
	public void setDeptManagers_1(Set<DeptManager> deptManagers_1)
	{
		this.deptManagers_1 = deptManagers_1;
	}
	
	@Caption("DeptEmps 1 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
	public Set<DeptEmp> getDeptEmps_1_1()
	{
		return this.deptEmps_1_1;
	}
	
	public void setDeptEmps_1_1(Set<DeptEmp> deptEmps_1_1)
	{
		this.deptEmps_1_1 = deptEmps_1_1;
	}
	
	@Caption("DeptManagers 1 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
	public Set<DeptManager> getDeptManagers_1_1()
	{
		return this.deptManagers_1_1;
	}
	
	public void setDeptManagers_1_1(Set<DeptManager> deptManagers_1_1)
	{
		this.deptManagers_1_1 = deptManagers_1_1;
	}
	
}
