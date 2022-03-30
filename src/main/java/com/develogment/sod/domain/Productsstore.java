
package com.develogment.sod.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import com.develogment.sod.dal.ProductsstoreDAO;
import com.rapidclipse.framework.server.data.DAO;
import com.rapidclipse.framework.server.resources.Caption;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * Productsstore
 */
@DAO(ProductsstoreDAO.class)
@Caption("{%storeName}")
@Entity
@Cacheable(true)
@Table(name = "productsstores", catalog = "sakila")
public class Productsstore implements java.io.Serializable
{
	
	private int       id;
	private String    storeName;
	private Set<Sale> sales = new HashSet<Sale>(0);
	
	public Productsstore()
	{
	}
	
	@Caption("Id")
	@Id
	@GeneratedValue(strategy = IDENTITY)
	
	@Column(name = "id", unique = true, nullable = false, columnDefinition = "INT")
	public int getId()
	{
		return this.id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	@Caption("StoreName")
	@Column(name = "store_name", columnDefinition = "VARCHAR", length = 100)
	public String getStoreName()
	{
		return this.storeName;
	}
	
	public void setStoreName(String storeName)
	{
		this.storeName = storeName;
	}
	
	@Caption("Sales")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productsstore")
	public Set<Sale> getSales()
	{
		return this.sales;
	}
	
	public void setSales(Set<Sale> sales)
	{
		this.sales = sales;
	}
	
}
