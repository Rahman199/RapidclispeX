
package com.develogment.sod.domain;

import com.develogment.sod.dal.SaleDAO;
import com.rapidclipse.framework.server.data.DAO;
import com.rapidclipse.framework.server.resources.Caption;
import java.math.BigDecimal;
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
 * Sale
 */
@DAO(SaleDAO.class)
@Caption("{%id}")
@Entity
@Cacheable(true)
@Table(name = "sales", catalog = "sakila")
public class Sale implements java.io.Serializable
{
	
	private SaleId        id;
	private Product       product;
	private Productsstore productsstore;
	private BigDecimal    quantity;
	private Date          salesDate;
	
	public Sale()
	{
	}
	
	@Caption("Id")
	@EmbeddedId
	
	@AttributeOverrides({
		@AttributeOverride(name = "productId", column = @Column(name = "product_id", nullable = false, columnDefinition = "INT")),
		@AttributeOverride(name = "storeId", column = @Column(name = "store_id", nullable = false, columnDefinition = "INT"))})
	public SaleId getId()
	{
		return this.id;
	}
	
	public void setId(SaleId id)
	{
		this.id = id;
	}
	
	@Caption("Product")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_id", nullable = false, insertable = false, updatable = false, columnDefinition = "INT")
	public Product getProduct()
	{
		return this.product;
	}
	
	public void setProduct(Product product)
	{
		this.product = product;
	}
	
	@Caption("Productsstore")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "store_id", nullable = false, insertable = false, updatable = false, columnDefinition = "INT")
	public Productsstore getProductsstore()
	{
		return this.productsstore;
	}
	
	public void setProductsstore(Productsstore productsstore)
	{
		this.productsstore = productsstore;
	}
	
	@Caption("Quantity")
	@Column(name = "quantity", nullable = false, columnDefinition = "DECIMAL", precision = 13)
	public BigDecimal getQuantity()
	{
		return this.quantity;
	}
	
	public void setQuantity(BigDecimal quantity)
	{
		this.quantity = quantity;
	}
	
	@Caption("SalesDate")
	@Temporal(TemporalType.DATE)
	@Column(name = "sales_date", nullable = false, columnDefinition = "DATE", length = 10)
	public Date getSalesDate()
	{
		return this.salesDate;
	}
	
	public void setSalesDate(Date salesDate)
	{
		this.salesDate = salesDate;
	}
	
}
