
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.SaleId;
import com.develogment.sod.domain.Sale;


/**
 * Home object for domain model class Sale.
 * 
 * @see Sale
 */
public class SaleDAO extends JpaDataAccessObject.Default<Sale, SaleId>
{
	public final static SaleDAO INSTANCE = new SaleDAO();
	
	public SaleDAO()
	{
		super(Sale.class);
	}
}
