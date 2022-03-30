
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.MoviesWorldwide;


/**
 * Home object for domain model class MoviesWorldwide.
 * 
 * @see MoviesWorldwide
 */
public class MoviesWorldwideDAO extends JpaDataAccessObject.Default<MoviesWorldwide, Integer>
{
	public final static MoviesWorldwideDAO INSTANCE = new MoviesWorldwideDAO();
	
	public MoviesWorldwideDAO()
	{
		super(MoviesWorldwide.class);
	}
}
