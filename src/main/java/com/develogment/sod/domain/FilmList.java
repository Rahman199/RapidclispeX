
package com.develogment.sod.domain;

import com.develogment.sod.dal.FilmListDAO;
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
 * FilmList
 */
@DAO(FilmListDAO.class)
@Caption("{%id}")
@Entity
@Cacheable(true)
@Table(name = "film_list", catalog = "sakila")
public class FilmList implements java.io.Serializable
{
	
	private FilmListId id;
	
	public FilmList()
	{
	}
	
	@Caption("Id")
	@EmbeddedId
	
	@AttributeOverrides({
		@AttributeOverride(name = "fid", column = @Column(name = "FID", columnDefinition = "SMALLINT UNSIGNED")),
		@AttributeOverride(name = "title", column = @Column(name = "title", columnDefinition = "VARCHAR")),
		@AttributeOverride(name = "description", column = @Column(name = "description", columnDefinition = "TEXT", length = 65535)),
		@AttributeOverride(name = "category", column = @Column(name = "category", nullable = false, columnDefinition = "VARCHAR", length = 25)),
		@AttributeOverride(name = "price", column = @Column(name = "price", columnDefinition = "DECIMAL", precision = 4)),
		@AttributeOverride(name = "length", column = @Column(name = "length", columnDefinition = "SMALLINT UNSIGNED")),
		@AttributeOverride(name = "rating", column = @Column(name = "rating", columnDefinition = "ENUM", length = 5)),
		@AttributeOverride(name = "actors", column = @Column(name = "actors", columnDefinition = "TEXT", length = 65535))})
	public FilmListId getId()
	{
		return this.id;
	}
	
	public void setId(FilmListId id)
	{
		this.id = id;
	}
	
}
