
package com.develogment.sod.domain;

import com.develogment.sod.dal.SalesByStoreDAO;
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
 * SalesByStore
 */
@DAO(SalesByStoreDAO.class)
@Caption("{%id}")
@Entity
@Cacheable(true)
@Table(name = "sales_by_store", catalog = "sakila")
public class SalesByStore implements java.io.Serializable
{
	
	private SalesByStoreId id;
	
	public SalesByStore()
	{
	}
	
	@Caption("Id")
	@EmbeddedId
	
	@AttributeOverrides({
		@AttributeOverride(name = "store", column = @Column(name = "store", columnDefinition = "VARCHAR", length = 101)),
		@AttributeOverride(name = "manager", column = @Column(name = "manager", columnDefinition = "VARCHAR", length = 91)),
		@AttributeOverride(name = "totalSales", column = @Column(name = "total_sales", columnDefinition = "DECIMAL", precision = 27))})
	public SalesByStoreId getId()
	{
		return this.id;
	}
	
	public void setId(SalesByStoreId id)
	{
		this.id = id;
	}
	
}
