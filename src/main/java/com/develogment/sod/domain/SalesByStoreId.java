
package com.develogment.sod.domain;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * SalesByStoreId
 */
@Embeddable
public class SalesByStoreId implements java.io.Serializable
{
	
	private String     store;
	private String     manager;
	private BigDecimal totalSales;
	
	public SalesByStoreId()
	{
	}
	
	@Column(name = "store", columnDefinition = "VARCHAR", length = 101)
	public String getStore()
	{
		return this.store;
	}
	
	public void setStore(String store)
	{
		this.store = store;
	}
	
	@Column(name = "manager", columnDefinition = "VARCHAR", length = 91)
	public String getManager()
	{
		return this.manager;
	}
	
	public void setManager(String manager)
	{
		this.manager = manager;
	}
	
	@Column(name = "total_sales", columnDefinition = "DECIMAL", precision = 27)
	public BigDecimal getTotalSales()
	{
		return this.totalSales;
	}
	
	public void setTotalSales(BigDecimal totalSales)
	{
		this.totalSales = totalSales;
	}
	
	public boolean equals(Object other)
	{
		if((this == other))
			return true;
		if((other == null))
			return false;
		if(!(other instanceof SalesByStoreId))
			return false;
		SalesByStoreId castOther = (SalesByStoreId)other;
		
		return ((this.getStore() == castOther.getStore()) || (this.getStore() != null && castOther.getStore() != null
			&& this.getStore().equals(castOther.getStore())))
			&& ((this.getManager() == castOther.getManager()) || (this.getManager() != null
				&& castOther.getManager() != null && this.getManager().equals(castOther.getManager())))
			&& ((this.getTotalSales() == castOther.getTotalSales()) || (this.getTotalSales() != null
				&& castOther.getTotalSales() != null && this.getTotalSales().equals(castOther.getTotalSales())));
	}
	
	public int hashCode()
	{
		int result = 17;
		
		result = 37 * result + (getStore() == null ? 0 : this.getStore().hashCode());
		result = 37 * result + (getManager() == null ? 0 : this.getManager().hashCode());
		result = 37 * result + (getTotalSales() == null ? 0 : this.getTotalSales().hashCode());
		return result;
	}
	
}
