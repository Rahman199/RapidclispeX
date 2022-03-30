
package com.develogment.sod.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * SaleId
 */
@Embeddable
public class SaleId implements java.io.Serializable
{
	
	private int productId;
	private int storeId;
	
	public SaleId()
	{
	}
	
	@Column(name = "product_id", nullable = false, columnDefinition = "INT")
	public int getProductId()
	{
		return this.productId;
	}
	
	public void setProductId(int productId)
	{
		this.productId = productId;
	}
	
	@Column(name = "store_id", nullable = false, columnDefinition = "INT")
	public int getStoreId()
	{
		return this.storeId;
	}
	
	public void setStoreId(int storeId)
	{
		this.storeId = storeId;
	}
	
	public boolean equals(Object other)
	{
		if((this == other))
			return true;
		if((other == null))
			return false;
		if(!(other instanceof SaleId))
			return false;
		SaleId castOther = (SaleId)other;
		
		return (this.getProductId() == castOther.getProductId())
			&& (this.getStoreId() == castOther.getStoreId());
	}
	
	public int hashCode()
	{
		int result = 17;
		
		result = 37 * result + this.getProductId();
		result = 37 * result + this.getStoreId();
		return result;
	}
	
}
