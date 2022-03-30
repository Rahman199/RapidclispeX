
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.NicerButSlowerFilmListId;
import com.develogment.sod.domain.NicerButSlowerFilmList;


/**
 * Home object for domain model class NicerButSlowerFilmList.
 * 
 * @see NicerButSlowerFilmList
 */
public class NicerButSlowerFilmListDAO
	extends JpaDataAccessObject.Default<NicerButSlowerFilmList, NicerButSlowerFilmListId>
{
	public final static NicerButSlowerFilmListDAO INSTANCE = new NicerButSlowerFilmListDAO();
	
	public NicerButSlowerFilmListDAO()
	{
		super(NicerButSlowerFilmList.class);
	}
}
