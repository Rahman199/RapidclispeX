
package com.develogment.sod.domain;

import com.develogment.sod.dal.SalaryDAO;
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
 * Salary
 */
@DAO(SalaryDAO.class)
@Caption("{%id}")
@Entity
@Cacheable(true)
@Table(name = "salaries", catalog = "employees")
public class Salary implements java.io.Serializable
{
	
	private SalaryId id;
	private Employee employee;
	private int      salary;
	private Date     toDate;
	
	public Salary()
	{
	}
	
	@Caption("Id")
	@EmbeddedId
	
	@AttributeOverrides({
		@AttributeOverride(name = "empNo", column = @Column(name = "emp_no", nullable = false, columnDefinition = "INT")),
		@AttributeOverride(name = "fromDate", column = @Column(name = "from_date", nullable = false, columnDefinition = "DATE", length = 10))})
	public SalaryId getId()
	{
		return this.id;
	}
	
	public void setId(SalaryId id)
	{
		this.id = id;
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
	
	@Caption("Salary")
	@Column(name = "salary", nullable = false, columnDefinition = "INT")
	public int getSalary()
	{
		return this.salary;
	}
	
	public void setSalary(int salary)
	{
		this.salary = salary;
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
