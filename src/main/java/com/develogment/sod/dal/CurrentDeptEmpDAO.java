
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.CurrentDeptEmp;
import com.develogment.sod.domain.CurrentDeptEmpId;


/**
 * Home object for domain model class CurrentDeptEmp.
 * 
 * @see CurrentDeptEmp
 */
public class CurrentDeptEmpDAO extends JpaDataAccessObject.Default<CurrentDeptEmp, CurrentDeptEmpId>
{
	public final static CurrentDeptEmpDAO INSTANCE = new CurrentDeptEmpDAO();
	
	public CurrentDeptEmpDAO()
	{
		super(CurrentDeptEmp.class);
	}
}
