
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.Inventory;


/**
 * Home object for domain model class Inventory.
 * 
 * @see Inventory
 */
public class InventoryDAO extends JpaDataAccessObject.Default<Inventory, Integer>
{
	public final static InventoryDAO INSTANCE = new InventoryDAO();
	
	public InventoryDAO()
	{
		super(Inventory.class);
	}
}
