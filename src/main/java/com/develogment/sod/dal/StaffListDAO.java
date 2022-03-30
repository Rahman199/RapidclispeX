
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.StaffList;
import com.develogment.sod.domain.StaffListId;


/**
 * Home object for domain model class StaffList.
 * 
 * @see StaffList
 */
public class StaffListDAO extends JpaDataAccessObject.Default<StaffList, StaffListId>
{
	public final static StaffListDAO INSTANCE = new StaffListDAO();
	
	public StaffListDAO()
	{
		super(StaffList.class);
	}
}
