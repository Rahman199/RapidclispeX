
package com.develogment.sod.domain;

import java.math.BigDecimal;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import com.develogment.sod.dal.ProductDAO;
import com.rapidclipse.framework.server.data.DAO;
import com.rapidclipse.framework.server.resources.Caption;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Product
 */
@DAO(ProductDAO.class)
@Caption("{%productName}")
@Entity
@Cacheable(true)
@Table(name = "products", catalog = "sakila")
public class Product implements java.io.Serializable
{
	
	private int        id;
	private String     productName;
	private BigDecimal price;
	private byte[]     image;
	private byte[]     description;
	
	public Product()
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
	
	@Caption("ProductName")
	@Column(name = "product_name", columnDefinition = "VARCHAR", length = 100)
	public String getProductName()
	{
		return this.productName;
	}
	
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	
	@Caption("Price")
	@Column(name = "price", columnDefinition = "DECIMAL", precision = 13)
	public BigDecimal getPrice()
	{
		return this.price;
	}
	
	public void setPrice(BigDecimal price)
	{
		this.price = price;
	}
	
	@Caption("Image")
	@Column(name = "IMAGE", columnDefinition = "LONGBLOB")
	public byte[] getImage()
	{
		return this.image;
	}
	
	public void setImage(byte[] image)
	{
		this.image = image;
	}
	
	@Caption("Description")
	@Column(name = "description", columnDefinition = "TEXT", length = 65535)
	public byte[] getDescription()
	{
		return this.description;
	}
	
	public void setDescription(byte[] description)
	{
		this.description = description;
	}
	
}
