
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.Category;


/**
 * Home object for domain model class Category.
 * 
 * @see Category
 */
public class CategoryDAO extends JpaDataAccessObject.Default<Category, Short>
{
	public final static CategoryDAO INSTANCE = new CategoryDAO();
	
	public CategoryDAO()
	{
		super(Category.class);
	}
}
