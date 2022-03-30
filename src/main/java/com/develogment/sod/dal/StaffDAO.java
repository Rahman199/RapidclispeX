
package com.develogment.sod.dal;

import com.develogment.sod.domain.Staff;
import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;


/**
 * Home object for domain model class Staff.
 * 
 * @see Staff
 */
public class StaffDAO extends JpaDataAccessObject.Default<Staff, Short>
{
	public final static StaffDAO INSTANCE = new StaffDAO();
	
	public StaffDAO()
	{
		super(Staff.class);
	}
}
