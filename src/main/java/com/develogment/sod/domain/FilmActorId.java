
package com.develogment.sod.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * FilmActorId
 */
@Embeddable
public class FilmActorId implements java.io.Serializable
{
	
	private short actorId;
	private short filmId;
	
	public FilmActorId()
	{
	}
	
	@Column(name = "actor_id", nullable = false, columnDefinition = "SMALLINT UNSIGNED")
	public short getActorId()
	{
		return this.actorId;
	}
	
	public void setActorId(short actorId)
	{
		this.actorId = actorId;
	}
	
	@Column(name = "film_id", nullable = false, columnDefinition = "SMALLINT UNSIGNED")
	public short getFilmId()
	{
		return this.filmId;
	}
	
	public void setFilmId(short filmId)
	{
		this.filmId = filmId;
	}
	
	public boolean equals(Object other)
	{
		if((this == other))
			return true;
		if((other == null))
			return false;
		if(!(other instanceof FilmActorId))
			return false;
		FilmActorId castOther = (FilmActorId)other;
		
		return (this.getActorId() == castOther.getActorId())
			&& (this.getFilmId() == castOther.getFilmId());
	}
	
	public int hashCode()
	{
		int result = 17;
		
		result = 37 * result + this.getActorId();
		result = 37 * result + this.getFilmId();
		return result;
	}
	
}
