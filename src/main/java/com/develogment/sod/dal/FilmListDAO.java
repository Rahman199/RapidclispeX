
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.FilmListId;
import com.develogment.sod.domain.FilmList;


/**
 * Home object for domain model class FilmList.
 * 
 * @see FilmList
 */
public class FilmListDAO extends JpaDataAccessObject.Default<FilmList, FilmListId>
{
	public final static FilmListDAO INSTANCE = new FilmListDAO();
	
	public FilmListDAO()
	{
		super(FilmList.class);
	}
}
