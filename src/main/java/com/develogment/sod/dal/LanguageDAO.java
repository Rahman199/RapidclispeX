
package com.develogment.sod.dal;

import com.develogment.sod.domain.Language;
import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;


/**
 * Home object for domain model class Language.
 * 
 * @see Language
 */
public class LanguageDAO extends JpaDataAccessObject.Default<Language, Short>
{
	public final static LanguageDAO INSTANCE = new LanguageDAO();
	
	public LanguageDAO()
	{
		super(Language.class);
	}
}
