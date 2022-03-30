
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.Department;


/**
 * Home object for domain model class Department.
 * 
 * @see Department
 */
public class DepartmentDAO extends JpaDataAccessObject.Default<Department, String>
{
	public final static DepartmentDAO INSTANCE = new DepartmentDAO();
	
	public DepartmentDAO()
	{
		super(Department.class);
	}
}
