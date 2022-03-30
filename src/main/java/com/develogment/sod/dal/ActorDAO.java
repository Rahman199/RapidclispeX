
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.Actor;


/**
 * Home object for domain model class Actor.
 * 
 * @see Actor
 */
public class ActorDAO extends JpaDataAccessObject.Default<Actor, Short>
{
	public final static ActorDAO INSTANCE = new ActorDAO();
	
	public ActorDAO()
	{
		super(Actor.class);
	}
}
