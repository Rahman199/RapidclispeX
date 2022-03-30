
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.Address;


/**
 * Home object for domain model class Address.
 * 
 * @see Address
 */
public class AddressDAO extends JpaDataAccessObject.Default<Address, Short>
{
	public final static AddressDAO INSTANCE = new AddressDAO();
	
	public AddressDAO()
	{
		super(Address.class);
	}
}
