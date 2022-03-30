
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.SalesByStoreId;
import com.develogment.sod.domain.SalesByStore;


/**
 * Home object for domain model class SalesByStore.
 * 
 * @see SalesByStore
 */
public class SalesByStoreDAO extends JpaDataAccessObject.Default<SalesByStore, SalesByStoreId>
{
	public final static SalesByStoreDAO INSTANCE = new SalesByStoreDAO();
	
	public SalesByStoreDAO()
	{
		super(SalesByStore.class);
	}
}
