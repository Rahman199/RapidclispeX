
package com.develogment.sod.domain;

import com.develogment.sod.dal.StaffListDAO;
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
 * StaffList
 */
@DAO(StaffListDAO.class)
@Caption("{%id}")
@Entity
@Cacheable(true)
@Table(name = "staff_list", catalog = "sakila")
public class StaffList implements java.io.Serializable
{
	
	private StaffListId id;
	
	public StaffList()
	{
	}
	
	@Caption("Id")
	@EmbeddedId
	
	@AttributeOverrides({
		@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, columnDefinition = "TINYINT UNSIGNED")),
		@AttributeOverride(name = "name", column = @Column(name = "name", columnDefinition = "VARCHAR", length = 91)),
		@AttributeOverride(name = "address", column = @Column(name = "address", nullable = false, columnDefinition = "VARCHAR", length = 50)),
		@AttributeOverride(name = "zipCode", column = @Column(name = "zip code", columnDefinition = "VARCHAR", length = 10)),
		@AttributeOverride(name = "phone", column = @Column(name = "phone", nullable = false, columnDefinition = "VARCHAR", length = 20)),
		@AttributeOverride(name = "city", column = @Column(name = "city", nullable = false, columnDefinition = "VARCHAR", length = 50)),
		@AttributeOverride(name = "country", column = @Column(name = "country", nullable = false, columnDefinition = "VARCHAR", length = 50)),
		@AttributeOverride(name = "sid", column = @Column(name = "SID", nullable = false, columnDefinition = "TINYINT UNSIGNED"))})
	public StaffListId getId()
	{
		return this.id;
	}
	
	public void setId(StaffListId id)
	{
		this.id = id;
	}
	
}
