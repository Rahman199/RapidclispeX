
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

import com.develogment.sod.dal.CategoryDAO;
import com.rapidclipse.framework.server.data.DAO;
import com.rapidclipse.framework.server.resources.Caption;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Category
 */
@DAO(CategoryDAO.class)
@Caption("{%name}")
@Entity
@Cacheable(true)
@Table(name = "category", catalog = "sakila")
public class Category implements java.io.Serializable
{
	
	private short             categoryId;
	private String            name;
	private Date              lastUpdate;
	private Set<FilmCategory> filmCategories_1   = new HashSet<FilmCategory>(0);
	private Set<FilmCategory> filmCategories_1_1 = new HashSet<FilmCategory>(0);
	
	public Category()
	{
	}
	
	@Caption("CategoryId")
	@Id
	@GeneratedValue(strategy = IDENTITY)
	
	@Column(name = "category_id", unique = true, nullable = false, columnDefinition = "TINYINT UNSIGNED")
	public short getCategoryId()
	{
		return this.categoryId;
	}
	
	public void setCategoryId(short categoryId)
	{
		this.categoryId = categoryId;
	}
	
	@Caption("Name")
	@Column(name = "name", nullable = false, columnDefinition = "VARCHAR", length = 25)
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
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
	
	@Caption("FilmCategories 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public Set<FilmCategory> getFilmCategories_1()
	{
		return this.filmCategories_1;
	}
	
	public void setFilmCategories_1(Set<FilmCategory> filmCategories_1)
	{
		this.filmCategories_1 = filmCategories_1;
	}
	
	@Caption("FilmCategories 1 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public Set<FilmCategory> getFilmCategories_1_1()
	{
		return this.filmCategories_1_1;
	}
	
	public void setFilmCategories_1_1(Set<FilmCategory> filmCategories_1_1)
	{
		this.filmCategories_1_1 = filmCategories_1_1;
	}
	
}
