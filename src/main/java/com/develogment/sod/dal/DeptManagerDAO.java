
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.DeptManagerId;
import com.develogment.sod.domain.DeptManager;


/**
 * Home object for domain model class DeptManager.
 * 
 * @see DeptManager
 */
public class DeptManagerDAO extends JpaDataAccessObject.Default<DeptManager, DeptManagerId>
{
	public final static DeptManagerDAO INSTANCE = new DeptManagerDAO();
	
	public DeptManagerDAO()
	{
		super(DeptManager.class);
	}
}
