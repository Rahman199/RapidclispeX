
package com.develogment.sod.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * TitleId
 */
@Embeddable
public class TitleId implements java.io.Serializable
{
	
	private int    empNo;
	private String title;
	private Date   fromDate;
	
	public TitleId()
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
	
	@Column(name = "title", nullable = false, columnDefinition = "VARCHAR", length = 50)
	public String getTitle()
	{
		return this.title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	@Column(name = "from_date", nullable = false, columnDefinition = "DATE", length = 10)
	public Date getFromDate()
	{
		return this.fromDate;
	}
	
	public void setFromDate(Date fromDate)
	{
		this.fromDate = fromDate;
	}
	
	public boolean equals(Object other)
	{
		if((this == other))
			return true;
		if((other == null))
			return false;
		if(!(other instanceof TitleId))
			return false;
		TitleId castOther = (TitleId)other;
		
		return (this.getEmpNo() == castOther.getEmpNo())
			&& ((this.getTitle() == castOther.getTitle()) || (this.getTitle() != null && castOther.getTitle() != null
				&& this.getTitle().equals(castOther.getTitle())))
			&& ((this.getFromDate() == castOther.getFromDate()) || (this.getFromDate() != null
				&& castOther.getFromDate() != null && this.getFromDate().equals(castOther.getFromDate())));
	}
	
	public int hashCode()
	{
		int result = 17;
		
		result = 37 * result + this.getEmpNo();
		result = 37 * result + (getTitle() == null ? 0 : this.getTitle().hashCode());
		result = 37 * result + (getFromDate() == null ? 0 : this.getFromDate().hashCode());
		return result;
	}
	
}
