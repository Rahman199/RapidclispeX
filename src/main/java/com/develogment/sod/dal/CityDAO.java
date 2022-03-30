
package com.develogment.sod.dal;

import com.develogment.sod.domain.City;
import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;


/**
 * Home object for domain model class City.
 * 
 * @see City
 */
public class CityDAO extends JpaDataAccessObject.Default<City, Short>
{
	public final static CityDAO INSTANCE = new CityDAO();
	
	public CityDAO()
	{
		super(City.class);
	}
}
