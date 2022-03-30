
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.FilmText;


/**
 * Home object for domain model class FilmText.
 * 
 * @see FilmText
 */
public class FilmTextDAO extends JpaDataAccessObject.Default<FilmText, Short>
{
	public final static FilmTextDAO INSTANCE = new FilmTextDAO();
	
	public FilmTextDAO()
	{
		super(FilmText.class);
	}
}
