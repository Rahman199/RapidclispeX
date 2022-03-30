
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.SalaryId;
import com.develogment.sod.domain.Salary;


/**
 * Home object for domain model class Salary.
 * 
 * @see Salary
 */
public class SalaryDAO extends JpaDataAccessObject.Default<Salary, SalaryId>
{
	public final static SalaryDAO INSTANCE = new SalaryDAO();
	
	public SalaryDAO()
	{
		super(Salary.class);
	}
}
