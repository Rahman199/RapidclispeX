
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.FilmCategoryId;
import com.develogment.sod.domain.FilmCategory;


/**
 * Home object for domain model class FilmCategory.
 * 
 * @see FilmCategory
 */
public class FilmCategoryDAO extends JpaDataAccessObject.Default<FilmCategory, FilmCategoryId>
{
	public final static FilmCategoryDAO INSTANCE = new FilmCategoryDAO();
	
	public FilmCategoryDAO()
	{
		super(FilmCategory.class);
	}
}
