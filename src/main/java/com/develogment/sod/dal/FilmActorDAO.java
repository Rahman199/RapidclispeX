
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.FilmActorId;
import com.develogment.sod.domain.FilmActor;


/**
 * Home object for domain model class FilmActor.
 * 
 * @see FilmActor
 */
public class FilmActorDAO extends JpaDataAccessObject.Default<FilmActor, FilmActorId>
{
	public final static FilmActorDAO INSTANCE = new FilmActorDAO();
	
	public FilmActorDAO()
	{
		super(FilmActor.class);
	}
}
