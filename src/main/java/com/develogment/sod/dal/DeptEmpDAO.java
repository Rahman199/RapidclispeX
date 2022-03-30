
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.DeptEmp;
import com.develogment.sod.domain.DeptEmpId;


/**
 * Home object for domain model class DeptEmp.
 * 
 * @see DeptEmp
 */
public class DeptEmpDAO extends JpaDataAccessObject.Default<DeptEmp, DeptEmpId>
{
	public final static DeptEmpDAO INSTANCE = new DeptEmpDAO();
	
	public DeptEmpDAO()
	{
		super(DeptEmp.class);
	}
}
