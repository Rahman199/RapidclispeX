
package com.develogment.sod.domain;

import com.develogment.sod.dal.NicerButSlowerFilmListDAO;
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
 * NicerButSlowerFilmList
 */
@DAO(NicerButSlowerFilmListDAO.class)
@Caption("{%id}")
@Entity
@Cacheable(true)
@Table(name = "nicer_but_slower_film_list", catalog = "sakila")
public class NicerButSlowerFilmList implements java.io.Serializable
{
	
	private NicerButSlowerFilmListId id;
	
	public NicerButSlowerFilmList()
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
	public NicerButSlowerFilmListId getId()
	{
		return this.id;
	}
	
	public void setId(NicerButSlowerFilmListId id)
	{
		this.id = id;
	}
	
}
