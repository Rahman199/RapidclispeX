
package com.develogment.sod.domain;

import com.develogment.sod.dal.SalesByFilmCategoryDAO;
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
 * SalesByFilmCategory
 */
@DAO(SalesByFilmCategoryDAO.class)
@Caption("{%id}")
@Entity
@Cacheable(true)
@Table(name = "sales_by_film_category", catalog = "sakila")
public class SalesByFilmCategory implements java.io.Serializable
{
	
	private SalesByFilmCategoryId id;
	
	public SalesByFilmCategory()
	{
	}
	
	@Caption("Id")
	@EmbeddedId
	
	@AttributeOverrides({
		@AttributeOverride(name = "category", column = @Column(name = "category", nullable = false, columnDefinition = "VARCHAR", length = 25)),
		@AttributeOverride(name = "totalSales", column = @Column(name = "total_sales", columnDefinition = "DECIMAL", precision = 27))})
	public SalesByFilmCategoryId getId()
	{
		return this.id;
	}
	
	public void setId(SalesByFilmCategoryId id)
	{
		this.id = id;
	}
	
}
