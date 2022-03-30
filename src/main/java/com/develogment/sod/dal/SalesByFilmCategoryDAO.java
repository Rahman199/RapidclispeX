
package com.develogment.sod.dal;

import com.develogment.sod.domain.SalesByFilmCategory;
import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.SalesByFilmCategoryId;


/**
 * Home object for domain model class SalesByFilmCategory.
 * 
 * @see SalesByFilmCategory
 */
public class SalesByFilmCategoryDAO extends JpaDataAccessObject.Default<SalesByFilmCategory, SalesByFilmCategoryId>
{
	public final static SalesByFilmCategoryDAO INSTANCE = new SalesByFilmCategoryDAO();
	
	public SalesByFilmCategoryDAO()
	{
		super(SalesByFilmCategory.class);
	}
}
