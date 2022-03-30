
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.DeptEmpLatestDate;
import com.develogment.sod.domain.DeptEmpLatestDateId;


/**
 * Home object for domain model class DeptEmpLatestDate.
 * 
 * @see DeptEmpLatestDate
 */
public class DeptEmpLatestDateDAO extends JpaDataAccessObject.Default<DeptEmpLatestDate, DeptEmpLatestDateId>
{
	public final static DeptEmpLatestDateDAO INSTANCE = new DeptEmpLatestDateDAO();
	
	public DeptEmpLatestDateDAO()
	{
		super(DeptEmpLatestDate.class);
	}
}
