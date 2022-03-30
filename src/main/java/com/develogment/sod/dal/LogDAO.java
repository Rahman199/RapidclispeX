
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.Log;


/**
 * Home object for domain model class Log.
 * 
 * @see Log
 */
public class LogDAO extends JpaDataAccessObject.Default<Log, Integer>
{
	public final static LogDAO INSTANCE = new LogDAO();
	
	public LogDAO()
	{
		super(Log.class);
	}
}
