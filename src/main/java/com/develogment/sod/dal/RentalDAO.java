
package com.develogment.sod.dal;

import com.develogment.sod.domain.Rental;
import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;


/**
 * Home object for domain model class Rental.
 * 
 * @see Rental
 */
public class RentalDAO extends JpaDataAccessObject.Default<Rental, Integer>
{
	public final static RentalDAO INSTANCE = new RentalDAO();
	
	public RentalDAO()
	{
		super(Rental.class);
	}
}
