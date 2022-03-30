
package com.develogment.sod.dal;

import com.develogment.sod.domain.Customer;
import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;


/**
 * Home object for domain model class Customer.
 *
 * @see Customer
 */
public class CustomerDAO extends JpaDataAccessObject.Default<Customer, Short>
{

	public final static CustomerDAO INSTANCE = new CustomerDAO();
	
	public CustomerDAO()
	{
		super(Customer.class);
	}

}
