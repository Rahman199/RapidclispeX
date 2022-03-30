
package com.develogment.sod.domain;

import com.develogment.sod.dal.ActorInfoDAO;
import com.rapidclipse.framework.server.data.DAO;
import com.rapidclipse.framework.server.resources.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * ActorInfo
 */
@DAO(ActorInfoDAO.class)
@Caption("{%id}")
@Entity
@Cacheable(true)
@Table(name = "actor_info", catalog = "sakila")
public class ActorInfo implements java.io.Serializable
{
	
	private ActorInfoId id;
	
	public ActorInfo()
	{
	}
	
	@Caption("Id")
	@EmbeddedId
	
	@AttributeOverrides({
		@AttributeOverride(name = "actorId", column = @Column(name = "actor_id", nullable = false, columnDefinition = "SMALLINT UNSIGNED")),
		@AttributeOverride(name = "firstName", column = @Column(name = "first_name", nullable = false, columnDefinition = "VARCHAR", length = 45)),
		@AttributeOverride(name = "lastName", column = @Column(name = "last_name", nullable = false, columnDefinition = "VARCHAR", length = 45)),
		@AttributeOverride(name = "filmInfo", column = @Column(name = "film_info", columnDefinition = "TEXT", length = 65535))})
	public ActorInfoId getId()
	{
		return this.id;
	}
	
	public void setId(ActorInfoId id)
	{
		this.id = id;
	}
	
}
