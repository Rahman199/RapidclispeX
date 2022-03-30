
package com.develogment.sod.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import com.develogment.sod.dal.ActorDAO;
import com.rapidclipse.framework.server.data.DAO;
import com.rapidclipse.framework.server.resources.Caption;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Actor
 */
@DAO(ActorDAO.class)
@Caption("{%firstName}")
@Entity
@Cacheable(true)
@Table(name = "actor", catalog = "sakila")
public class Actor implements java.io.Serializable
{
	
	private Short          actorId;
	private String         firstName;
	private String         lastName;
	private Date           lastUpdate;
	private Set<FilmActor> filmActors_1   = new HashSet<FilmActor>(0);
	private Set<FilmActor> filmActors_1_1 = new HashSet<FilmActor>(0);
	
	public Actor()
	{
	}
	
	@Caption("ActorId")
	@Id
	@GeneratedValue(strategy = IDENTITY)
	
	@Column(name = "actor_id", unique = true, nullable = false, columnDefinition = "SMALLINT UNSIGNED")
	public Short getActorId()
	{
		return this.actorId;
	}
	
	public void setActorId(Short actorId)
	{
		this.actorId = actorId;
	}
	
	@Caption("FirstName")
	@Column(name = "first_name", nullable = false, columnDefinition = "VARCHAR", length = 45)
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	@Caption("LastName")
	@Column(name = "last_name", nullable = false, columnDefinition = "VARCHAR", length = 45)
	public String getLastName()
	{
		return this.lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	@Caption("LastUpdate")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update", nullable = false, columnDefinition = "TIMESTAMP", length = 19)
	public Date getLastUpdate()
	{
		return this.lastUpdate;
	}
	
	public void setLastUpdate(Date lastUpdate)
	{
		this.lastUpdate = lastUpdate;
	}
	
	@Caption("FilmActors 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "actor")
	public Set<FilmActor> getFilmActors_1()
	{
		return this.filmActors_1;
	}
	
	public void setFilmActors_1(Set<FilmActor> filmActors_1)
	{
		this.filmActors_1 = filmActors_1;
	}
	
	@Caption("FilmActors 1 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "actor")
	public Set<FilmActor> getFilmActors_1_1()
	{
		return this.filmActors_1_1;
	}
	
	public void setFilmActors_1_1(Set<FilmActor> filmActors_1_1)
	{
		this.filmActors_1_1 = filmActors_1_1;
	}
	
}
