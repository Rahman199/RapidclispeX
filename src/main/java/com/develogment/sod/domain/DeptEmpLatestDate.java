
package com.develogment.sod.domain;

import com.develogment.sod.dal.DeptEmpLatestDateDAO;
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
 * DeptEmpLatestDate
 */
@DAO(DeptEmpLatestDateDAO.class)
@Caption("{%id}")
@Entity
@Cacheable(true)
@Table(name = "dept_emp_latest_date", catalog = "employees")
public class DeptEmpLatestDate implements java.io.Serializable
{
	
	private DeptEmpLatestDateId id;
	
	public DeptEmpLatestDate()
	{
	}
	
	@Caption("Id")
	@EmbeddedId
	
	@AttributeOverrides({
		@AttributeOverride(name = "empNo", column = @Column(name = "emp_no", nullable = false, columnDefinition = "INT")),
		@AttributeOverride(name = "fromDate", column = @Column(name = "from_date", columnDefinition = "DATE", length = 10)),
		@AttributeOverride(name = "toDate", column = @Column(name = "to_date", columnDefinition = "DATE", length = 10))})
	public DeptEmpLatestDateId getId()
	{
		return this.id;
	}
	
	public void setId(DeptEmpLatestDateId id)
	{
		this.id = id;
	}
	
}
