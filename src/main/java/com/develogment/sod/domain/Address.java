
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

import com.develogment.sod.dal.AddressDAO;
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
 * Address
 */
@DAO(AddressDAO.class)
@Caption("{%address}")
@Entity
@Cacheable(true)
@Table(name = "address", catalog = "sakila")
public class Address implements java.io.Serializable
{
	
	private Short         addressId;
	private City          city;
	private String        address;
	private String        address2;
	private String        district;
	private String        postalCode;
	private String        phone;
	private byte[]        location;
	private Date          lastUpdate;
	private Set<Staff>    staffs_1      = new HashSet<Staff>(0);
	private Set<Customer> customers_1   = new HashSet<Customer>(0);
	private Set<Staff>    staffs_1_1    = new HashSet<Staff>(0);
	private Set<Customer> customers_1_1 = new HashSet<Customer>(0);
	private Set<Store>    stores        = new HashSet<Store>(0);
	private Set<Store>    stores_1      = new HashSet<Store>(0);
	
	public Address()
	{
	}
	
	@Caption("AddressId")
	@Id
	@GeneratedValue(strategy = IDENTITY)
	
	@Column(name = "address_id", unique = true, nullable = false, columnDefinition = "SMALLINT UNSIGNED")
	public Short getAddressId()
	{
		return this.addressId;
	}
	
	public void setAddressId(Short addressId)
	{
		this.addressId = addressId;
	}
	
	@Caption("City")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "city_id", nullable = false, columnDefinition = "SMALLINT UNSIGNED")
	public City getCity()
	{
		return this.city;
	}
	
	public void setCity(City city)
	{
		this.city = city;
	}
	
	@Caption("Address")
	@Column(name = "address", nullable = false, columnDefinition = "VARCHAR", length = 50)
	public String getAddress()
	{
		return this.address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	@Caption("Address2")
	@Column(name = "address2", columnDefinition = "VARCHAR", length = 50)
	public String getAddress2()
	{
		return this.address2;
	}
	
	public void setAddress2(String address2)
	{
		this.address2 = address2;
	}
	
	@Caption("District")
	@Column(name = "district", nullable = false, columnDefinition = "VARCHAR", length = 20)
	public String getDistrict()
	{
		return this.district;
	}
	
	public void setDistrict(String district)
	{
		this.district = district;
	}
	
	@Caption("PostalCode")
	@Column(name = "postal_code", columnDefinition = "VARCHAR", length = 10)
	public String getPostalCode()
	{
		return this.postalCode;
	}
	
	public void setPostalCode(String postalCode)
	{
		this.postalCode = postalCode;
	}
	
	@Caption("Phone")
	@Column(name = "phone", nullable = false, columnDefinition = "VARCHAR", length = 20)
	public String getPhone()
	{
		return this.phone;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	@Caption("Location")
	@Column(name = "location", nullable = false, columnDefinition = "GEOMETRY")
	public byte[] getLocation()
	{
		return this.location;
	}
	
	public void setLocation(byte[] location)
	{
		this.location = location;
	}
	
	@Caption("LastUpdate")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update", nullable = false, columnDefinition = "TIMESTAMP", length = 19)
	public Date getLastUpdate()
	{
		return this.lastUpdate;
	}
	
	public void setLastUpdate(Date lastUpdate)
	{
		this.lastUpdate = lastUpdate;
	}
	
	@Caption("Staffs 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
	public Set<Staff> getStaffs_1()
	{
		return this.staffs_1;
	}
	
	public void setStaffs_1(Set<Staff> staffs_1)
	{
		this.staffs_1 = staffs_1;
	}
	
	@Caption("Customers 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
	public Set<Customer> getCustomers_1()
	{
		return this.customers_1;
	}
	
	public void setCustomers_1(Set<Customer> customers_1)
	{
		this.customers_1 = customers_1;
	}
	
	@Caption("Staffs 1 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
	public Set<Staff> getStaffs_1_1()
	{
		return this.staffs_1_1;
	}
	
	public void setStaffs_1_1(Set<Staff> staffs_1_1)
	{
		this.staffs_1_1 = staffs_1_1;
	}
	
	@Caption("Customers 1 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
	public Set<Customer> getCustomers_1_1()
	{
		return this.customers_1_1;
	}
	
	public void setCustomers_1_1(Set<Customer> customers_1_1)
	{
		this.customers_1_1 = customers_1_1;
	}
	
	@Caption("Stores")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
	public Set<Store> getStores()
	{
		return this.stores;
	}
	
	public void setStores(Set<Store> stores)
	{
		this.stores = stores;
	}
	
	@Caption("Stores 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
	public Set<Store> getStores_1()
	{
		return this.stores_1;
	}
	
	public void setStores_1(Set<Store> stores_1)
	{
		this.stores_1 = stores_1;
	}
	
}
