
package com.develogment.sod.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * CurrentDeptEmpId
 */
@Embeddable
public class CurrentDeptEmpId implements java.io.Serializable
{
	
	private int    empNo;
	private String deptNo;
	private Date   fromDate;
	private Date   toDate;
	
	public CurrentDeptEmpId()
	{
	}
	
	@Column(name = "emp_no", nullable = false, columnDefinition = "INT")
	public int getEmpNo()
	{
		return this.empNo;
	}
	
	public void setEmpNo(int empNo)
	{
		this.empNo = empNo;
	}
	
	@Column(name = "dept_no", nullable = false, columnDefinition = "CHAR", length = 4)
	public String getDeptNo()
	{
		return this.deptNo;
	}
	
	public void setDeptNo(String deptNo)
	{
		this.deptNo = deptNo;
	}
	
	@Column(name = "from_date", columnDefinition = "DATE", length = 10)
	public Date getFromDate()
	{
		return this.fromDate;
	}
	
	public void setFromDate(Date fromDate)
	{
		this.fromDate = fromDate;
	}
	
	@Column(name = "to_date", columnDefinition = "DATE", length = 10)
	public Date getToDate()
	{
		return this.toDate;
	}
	
	public void setToDate(Date toDate)
	{
		this.toDate = toDate;
	}
	
	public boolean equals(Object other)
	{
		if((this == other))
			return true;
		if((other == null))
			return false;
		if(!(other instanceof CurrentDeptEmpId))
			return false;
		CurrentDeptEmpId castOther = (CurrentDeptEmpId)other;
		
		return (this.getEmpNo() == castOther.getEmpNo())
			&& ((this.getDeptNo() == castOther.getDeptNo()) || (this.getDeptNo() != null
				&& castOther.getDeptNo() != null && this.getDeptNo().equals(castOther.getDeptNo())))
			&& ((this.getFromDate() == castOther.getFromDate()) || (this.getFromDate() != null
				&& castOther.getFromDate() != null && this.getFromDate().equals(castOther.getFromDate())))
			&& ((this.getToDate() == castOther.getToDate()) || (this.getToDate() != null
				&& castOther.getToDate() != null && this.getToDate().equals(castOther.getToDate())));
	}
	
	public int hashCode()
	{
		int result = 17;
		
		result = 37 * result + this.getEmpNo();
		result = 37 * result + (getDeptNo() == null ? 0 : this.getDeptNo().hashCode());
		result = 37 * result + (getFromDate() == null ? 0 : this.getFromDate().hashCode());
		result = 37 * result + (getToDate() == null ? 0 : this.getToDate().hashCode());
		return result;
	}
	
}
