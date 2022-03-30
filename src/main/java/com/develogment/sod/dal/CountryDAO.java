
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.Country;


/**
 * Home object for domain model class Country.
 * 
 * @see Country
 */
public class CountryDAO extends JpaDataAccessObject.Default<Country, Short>
{
	public final static CountryDAO INSTANCE = new CountryDAO();
	
	public CountryDAO()
	{
		super(Country.class);
	}
}
