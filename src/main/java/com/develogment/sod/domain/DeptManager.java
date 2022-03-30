
package com.develogment.sod.domain;

import com.develogment.sod.dal.DeptManagerDAO;
import com.rapidclipse.framework.server.data.DAO;
import com.rapidclipse.framework.server.resources.Caption;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * DeptManager
 */
@DAO(DeptManagerDAO.class)
@Caption("{%id}")
@Entity
@Cacheable(true)
@Table(name = "dept_manager", catalog = "employees")
public class DeptManager implements java.io.Serializable
{
	
	private DeptManagerId id;
	private Department    department;
	private Employee      employee;
	private Date          fromDate;
	private Date          toDate;
	
	public DeptManager()
	{
	}
	
	@Caption("Id")
	@EmbeddedId
	
	@AttributeOverrides({
		@AttributeOverride(name = "empNo", column = @Column(name = "emp_no", nullable = false, columnDefinition = "INT")),
		@AttributeOverride(name = "deptNo", column = @Column(name = "dept_no", nullable = false, columnDefinition = "CHAR", length = 4))})
	public DeptManagerId getId()
	{
		return this.id;
	}
	
	public void setId(DeptManagerId id)
	{
		this.id = id;
	}
	
	@Caption("Department")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "dept_no", nullable = false, insertable = false, updatable = false, columnDefinition = "CHAR")
	public Department getDepartment()
	{
		return this.department;
	}
	
	public void setDepartment(Department department)
	{
		this.department = department;
	}
	
	@Caption("Employee")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "emp_no", nullable = false, insertable = false, updatable = false, columnDefinition = "INT")
	public Employee getEmployee()
	{
		return this.employee;
	}
	
	public void setEmployee(Employee employee)
	{
		this.employee = employee;
	}
	
	@Caption("FromDate")
	@Temporal(TemporalType.DATE)
	@Column(name = "from_date", nullable = false, columnDefinition = "DATE", length = 10)
	public Date getFromDate()
	{
		return this.fromDate;
	}
	
	public void setFromDate(Date fromDate)
	{
		this.fromDate = fromDate;
	}
	
	@Caption("ToDate")
	@Temporal(TemporalType.DATE)
	@Column(name = "to_date", nullable = false, columnDefinition = "DATE", length = 10)
	public Date getToDate()
	{
		return this.toDate;
	}
	
	public void setToDate(Date toDate)
	{
		this.toDate = toDate;
	}
	
}
