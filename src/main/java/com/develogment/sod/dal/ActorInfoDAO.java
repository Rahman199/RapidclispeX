
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.ActorInfoId;
import com.develogment.sod.domain.ActorInfo;


/**
 * Home object for domain model class ActorInfo.
 * 
 * @see ActorInfo
 */
public class ActorInfoDAO extends JpaDataAccessObject.Default<ActorInfo, ActorInfoId>
{
	public final static ActorInfoDAO INSTANCE = new ActorInfoDAO();
	
	public ActorInfoDAO()
	{
		super(ActorInfo.class);
	}
}
