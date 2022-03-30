
package com.develogment.sod.domain;

import com.develogment.sod.dal.CurrentDeptEmpDAO;
import com.rapidclipse.framework.server.data.DAO;
import com.rapidclipse.framework.server.resources.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * CurrentDeptEmp
 */
@DAO(CurrentDeptEmpDAO.class)
@Caption("{%id}")
@Entity
@Cacheable(true)
@Table(name = "current_dept_emp", catalog = "employees")
public class CurrentDeptEmp implements java.io.Serializable
{
	
	private CurrentDeptEmpId id;
	
	public CurrentDeptEmp()
	{
	}
	
	@Caption("Id")
	@EmbeddedId
	
	@AttributeOverrides({
		@AttributeOverride(name = "empNo", column = @Column(name = "emp_no", nullable = false, columnDefinition = "INT")),
		@AttributeOverride(name = "deptNo", column = @Column(name = "dept_no", nullable = false, columnDefinition = "CHAR", length = 4)),
		@AttributeOverride(name = "fromDate", column = @Column(name = "from_date", columnDefinition = "DATE", length = 10)),
		@AttributeOverride(name = "toDate", column = @Column(name = "to_date", columnDefinition = "DATE", length = 10))})
	public CurrentDeptEmpId getId()
	{
		return this.id;
	}
	
	public void setId(CurrentDeptEmpId id)
	{
		this.id = id;
	}
	
}
