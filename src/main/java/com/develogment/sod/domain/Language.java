
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

import com.develogment.sod.dal.LanguageDAO;
import com.rapidclipse.framework.server.data.DAO;
import com.rapidclipse.framework.server.resources.Caption;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Language
 */
@DAO(LanguageDAO.class)
@Caption("{%name}")
@Entity
@Cacheable(true)
@Table(name = "language", catalog = "sakila")
public class Language implements java.io.Serializable
{
	
	private short     languageId;
	private String    name;
	private Date      lastUpdate;
	private Set<Film> filmsForLanguageId_1           = new HashSet<Film>(0);
	private Set<Film> filmsForOriginalLanguageId_1   = new HashSet<Film>(0);
	private Set<Film> filmsForOriginalLanguageId_1_1 = new HashSet<Film>(0);
	private Set<Film> filmsForLanguageId_1_1         = new HashSet<Film>(0);
	
	public Language()
	{
	}
	
	@Caption("LanguageId")
	@Id
	@GeneratedValue(strategy = IDENTITY)
	
	@Column(name = "language_id", unique = true, nullable = false, columnDefinition = "TINYINT UNSIGNED")
	public short getLanguageId()
	{
		return this.languageId;
	}
	
	public void setLanguageId(short languageId)
	{
		this.languageId = languageId;
	}
	
	@Caption("Name")
	@Column(name = "name", nullable = false, columnDefinition = "CHAR", length = 20)
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
	
	@Caption("FilmsForLanguageId 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "languageByLanguageId")
	public Set<Film> getFilmsForLanguageId_1()
	{
		return this.filmsForLanguageId_1;
	}
	
	public void setFilmsForLanguageId_1(Set<Film> filmsForLanguageId_1)
	{
		this.filmsForLanguageId_1 = filmsForLanguageId_1;
	}
	
	@Caption("FilmsForOriginalLanguageId 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "languageByOriginalLanguageId")
	public Set<Film> getFilmsForOriginalLanguageId_1()
	{
		return this.filmsForOriginalLanguageId_1;
	}
	
	public void setFilmsForOriginalLanguageId_1(Set<Film> filmsForOriginalLanguageId_1)
	{
		this.filmsForOriginalLanguageId_1 = filmsForOriginalLanguageId_1;
	}
	
	@Caption("FilmsForOriginalLanguageId 1 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "languageByOriginalLanguageId")
	public Set<Film> getFilmsForOriginalLanguageId_1_1()
	{
		return this.filmsForOriginalLanguageId_1_1;
	}
	
	public void setFilmsForOriginalLanguageId_1_1(Set<Film> filmsForOriginalLanguageId_1_1)
	{
		this.filmsForOriginalLanguageId_1_1 = filmsForOriginalLanguageId_1_1;
	}
	
	@Caption("FilmsForLanguageId 1 1")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "languageByLanguageId")
	public Set<Film> getFilmsForLanguageId_1_1()
	{
		return this.filmsForLanguageId_1_1;
	}
	
	public void setFilmsForLanguageId_1_1(Set<Film> filmsForLanguageId_1_1)
	{
		this.filmsForLanguageId_1_1 = filmsForLanguageId_1_1;
	}
	
}
