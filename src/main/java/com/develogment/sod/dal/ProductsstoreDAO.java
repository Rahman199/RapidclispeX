
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.Productsstore;


/**
 * Home object for domain model class Productsstore.
 * 
 * @see Productsstore
 */
public class ProductsstoreDAO extends JpaDataAccessObject.Default<Productsstore, Integer>
{
	public final static ProductsstoreDAO INSTANCE = new ProductsstoreDAO();
	
	public ProductsstoreDAO()
	{
		super(Productsstore.class);
	}
}
