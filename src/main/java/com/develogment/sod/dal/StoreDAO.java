
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.Store;


/**
 * Home object for domain model class Store.
 * 
 * @see Store
 */
public class StoreDAO extends JpaDataAccessObject.Default<Store, Short>
{
	public final static StoreDAO INSTANCE = new StoreDAO();
	
	public StoreDAO()
	{
		super(Store.class);
	}
}
