
package com.develogment.sod.dal;

import com.develogment.sod.domain.CustomerList;
import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.CustomerListId;


/**
 * Home object for domain model class CustomerList.
 * 
 * @see CustomerList
 */
public class CustomerListDAO extends JpaDataAccessObject.Default<CustomerList, CustomerListId>
{
	public final static CustomerListDAO INSTANCE = new CustomerListDAO();
	
	public CustomerListDAO()
	{
		super(CustomerList.class);
	}
}
