
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.Title;
import com.develogment.sod.domain.TitleId;


/**
 * Home object for domain model class Title.
 * 
 * @see Title
 */
public class TitleDAO extends JpaDataAccessObject.Default<Title, TitleId>
{
	public final static TitleDAO INSTANCE = new TitleDAO();
	
	public TitleDAO()
	{
		super(Title.class);
	}
}
