
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.User;


/**
 * Home object for domain model class User.
 * 
 * @see User
 */
public class UserDAO extends JpaDataAccessObject.Default<User, Integer>
{
	public final static UserDAO INSTANCE = new UserDAO();
	
	public UserDAO()
	{
		super(User.class);
	}
}
