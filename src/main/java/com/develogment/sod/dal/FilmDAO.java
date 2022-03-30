
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.Film;


/**
 * Home object for domain model class Film.
 * 
 * @see Film
 */
public class FilmDAO extends JpaDataAccessObject.Default<Film, Short>
{
	public final static FilmDAO INSTANCE = new FilmDAO();
	
	public FilmDAO()
	{
		super(Film.class);
	}
}
