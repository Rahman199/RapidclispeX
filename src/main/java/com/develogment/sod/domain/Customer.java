
package com.develogment.sod.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import com.develogment.sod.dal.CustomerDAO;
import com.rapidclipse.framework.server.data.DAO;
import com.rapidclipse.framework.server.resources.Caption;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Customer
 */
@DAO(CustomerDAO.class)
@Caption("{%firstName}")
@Entity
@Cacheable(true)
@Table(name = "customer", catalog = "sakila")
public class Customer implements java.io.Serializable
{
	
	private Short        customerId;
	private Address      address;
	private Store        store;
	private String       firstName;
	private String       lastName;
	private String       email;
	private boolean      active;
	private Date         createDate;
	private Date         lastUpdate;
	private byte[]       picture;
	private Set<Payment> payments   = new HashSet<Payment>(0);
	private Set<Rental>  rentals    = new HashSet<Rental>(0);
	private Set<Rental>  rentals_1  = new HashSet<Rental>(0);
	private Set<Payment> payments_1 = new HashSet<Payment>(0);
	private String mime;
	
	public Customer()
	{
	}
	
	@Caption("CustomerId")
	@Id
	@GeneratedValue(strategy = IDENTITY)
	
	@Column(name = "customer_id", unique = true, nullable = false, columnDefinition = "SMALLINT UNSIGNED")
	public Short getCustomerId()
	{
		return this.customerId;
	}
	
	public void setCustomerId(Short customerId)
	{
		this.customerId = customerId;
	}
	
	@Caption("Address")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "address_id", nullable = false, columnDefinition = "SMALLINT UNSIGNED")
	public Address getAddress()
	{
		return this.address;
	}
	
	public void setAddress(Address address)
	{
		this.address = address;
	}
	
	@Caption("Store")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "store_id", nullable = false, columnDefinition = "TINYINT UNSIGNED")
	public Store getStore()
	{
		return this.store;
	}
	
	public void setStore(Store store)
	{
		this.store = store;
	}
	
	@Caption("FirstName")
	@Column(name = "first_name", nullable = false, columnDefinition = "VARCHAR", length = 45)
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	@Caption("LastName")
	@Column(name = "last_name", nullable = false, columnDefinition = "VARCHAR", length = 45)
	public String getLastName()
	{
		return this.lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	@Caption("Email")
	@Column(name = "email", columnDefinition = "VARCHAR", length = 50)
	public String getEmail()
	{
		return this.email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	@Caption("Active")
	@Column(name = "active", nullable = false, columnDefinition = "BIT")
	public boolean isActive()
	{
		return this.active;
	}
	
	public void setActive(boolean active)
	{
		this.active = active;
	}
	
	@Caption("CreateDate")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", nullable = false, columnDefinition = "DATETIME", length = 19)
	public Date getCreateDate()
	{
		return this.createDate;
	}
	
	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}
	
	@Caption("LastUpdate")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update", columnDefinition = "TIMESTAMP", length = 19)
	public Date getLastUpdate()
	{
		return this.lastUpdate;
	}
	
	public void setLastUpdate(Date lastUpdate)
	{
		this.lastUpdate = lastUpdate;
	}
	
	@Caption("Picture")
	@Column(name = "picture", columnDefinition = "LONGBLOB")
	public byte[] getPicture()
	{
		return this.picture;
	}
	
	public void setPicture(byte[] picture)
	{
		this.picture = picture;
	}
	
	@Caption("Payments")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
	public Set<Payment> getPayments()
	{
		return this.payments;
	}
	
	public void setPayments(Set<Payment> payments)
	{
		this.payments = payments;
	}
	
	@Caption("Rentals")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
	public Set<Rental> getRentals()
	{
		return this.rentals;
	}
	
	public void setRentals(Set<Rental> rentals)
	{
		this.rentals = rentals;
	}
	
	@Caption("Rentals 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
	public Set<Rental> getRentals_1()
	{
		return this.rentals_1;
	}
	
	public void setRentals_1(Set<Rental> rentals_1)
	{
		this.rentals_1 = rentals_1;
	}
	
	@Caption("Payments 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
	public Set<Payment> getPayments_1()
	{
		return this.payments_1;
	}
	
	public void setPayments_1(Set<Payment> payments_1)
	{
		this.payments_1 = payments_1;
	}

	@Caption("Mime")
	@Column(name = "mime")
	public String getMime()
	{
		return mime;
	}

	public void setMime(String noname)
	{
		this.mime = noname;
	}
	
}
