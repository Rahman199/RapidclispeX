
package com.develogment.sod.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * CustomerListId
 */
@Embeddable
public class CustomerListId implements java.io.Serializable
{
	
	private short  id;
	private String name;
	private String address;
	private String zipCode;
	private String phone;
	private String city;
	private String country;
	private String notes;
	private short  sid;
	
	public CustomerListId()
	{
	}
	
	@Column(name = "ID", nullable = false, columnDefinition = "SMALLINT UNSIGNED")
	public short getId()
	{
		return this.id;
	}
	
	public void setId(short id)
	{
		this.id = id;
	}
	
	@Column(name = "name", nullable = false, columnDefinition = "VARCHAR", length = 91)
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	@Column(name = "address", nullable = false, columnDefinition = "VARCHAR", length = 50)
	public String getAddress()
	{
		return this.address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	@Column(name = "zip code", columnDefinition = "VARCHAR", length = 10)
	public String getZipCode()
	{
		return this.zipCode;
	}
	
	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
	}
	
	@Column(name = "phone", nullable = false, columnDefinition = "VARCHAR", length = 20)
	public String getPhone()
	{
		return this.phone;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	@Column(name = "city", nullable = false, columnDefinition = "VARCHAR", length = 50)
	public String getCity()
	{
		return this.city;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	@Column(name = "country", nullable = false, columnDefinition = "VARCHAR", length = 50)
	public String getCountry()
	{
		return this.country;
	}
	
	public void setCountry(String country)
	{
		this.country = country;
	}
	
	@Column(name = "notes", nullable = false, columnDefinition = "VARCHAR", length = 6)
	public String getNotes()
	{
		return this.notes;
	}
	
	public void setNotes(String notes)
	{
		this.notes = notes;
	}
	
	@Column(name = "SID", nullable = false, columnDefinition = "TINYINT UNSIGNED")
	public short getSid()
	{
		return this.sid;
	}
	
	public void setSid(short sid)
	{
		this.sid = sid;
	}
	
	public boolean equals(Object other)
	{
		if((this == other))
			return true;
		if((other == null))
			return false;
		if(!(other instanceof CustomerListId))
			return false;
		CustomerListId castOther = (CustomerListId)other;
		
		return (this.getId() == castOther.getId())
			&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
				&& this.getName().equals(castOther.getName())))
			&& ((this.getAddress() == castOther.getAddress()) || (this.getAddress() != null
				&& castOther.getAddress() != null && this.getAddress().equals(castOther.getAddress())))
			&& ((this.getZipCode() == castOther.getZipCode()) || (this.getZipCode() != null
				&& castOther.getZipCode() != null && this.getZipCode().equals(castOther.getZipCode())))
			&& ((this.getPhone() == castOther.getPhone()) || (this.getPhone() != null && castOther.getPhone() != null
				&& this.getPhone().equals(castOther.getPhone())))
			&& ((this.getCity() == castOther.getCity()) || (this.getCity() != null && castOther.getCity() != null
				&& this.getCity().equals(castOther.getCity())))
			&& ((this.getCountry() == castOther.getCountry()) || (this.getCountry() != null
				&& castOther.getCountry() != null && this.getCountry().equals(castOther.getCountry())))
			&& ((this.getNotes() == castOther.getNotes()) || (this.getNotes() != null && castOther.getNotes() != null
				&& this.getNotes().equals(castOther.getNotes())))
			&& (this.getSid() == castOther.getSid());
	}
	
	public int hashCode()
	{
		int result = 17;
		
		result = 37 * result + this.getId();
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getAddress() == null ? 0 : this.getAddress().hashCode());
		result = 37 * result + (getZipCode() == null ? 0 : this.getZipCode().hashCode());
		result = 37 * result + (getPhone() == null ? 0 : this.getPhone().hashCode());
		result = 37 * result + (getCity() == null ? 0 : this.getCity().hashCode());
		result = 37 * result + (getCountry() == null ? 0 : this.getCountry().hashCode());
		result = 37 * result + (getNotes() == null ? 0 : this.getNotes().hashCode());
		result = 37 * result + this.getSid();
		return result;
	}
	
}
