
package com.develogment.sod.domain;

import java.math.BigDecimal;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import com.develogment.sod.dal.MoviesWorldwideDAO;
import com.rapidclipse.framework.server.data.DAO;
import com.rapidclipse.framework.server.resources.Caption;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * MoviesWorldwide
 */
@DAO(MoviesWorldwideDAO.class)
@Caption("{%productionCountries}")
@Entity
@Cacheable(true)
@Table(name = "movies_worldwide", catalog = "sakila")
public class MoviesWorldwide implements java.io.Serializable
{
	
	private int        id;
	private String     productionCountries;
	private BigDecimal noOfMovies;
	private BigDecimal averageProductionBudget;
	private BigDecimal totalWorldwideBoxOffice;
	
	public MoviesWorldwide()
	{
	}
	
	@Caption("Id")
	@Id
	@GeneratedValue(strategy = IDENTITY)
	
	@Column(name = "id", unique = true, nullable = false, columnDefinition = "INT")
	public int getId()
	{
		return this.id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	@Caption("ProductionCountries")
	@Column(name = "production_countries", nullable = false, columnDefinition = "VARCHAR", length = 50)
	public String getProductionCountries()
	{
		return this.productionCountries;
	}
	
	public void setProductionCountries(String productionCountries)
	{
		this.productionCountries = productionCountries;
	}
	
	@Caption("NoOfMovies")
	@Column(name = "no_of_movies", nullable = false, columnDefinition = "DECIMAL", scale = 4)
	public BigDecimal getNoOfMovies()
	{
		return this.noOfMovies;
	}
	
	public void setNoOfMovies(BigDecimal noOfMovies)
	{
		this.noOfMovies = noOfMovies;
	}
	
	@Caption("AverageProductionBudget")
	@Column(name = "average_production_budget", columnDefinition = "DECIMAL", scale = 4)
	public BigDecimal getAverageProductionBudget()
	{
		return this.averageProductionBudget;
	}
	
	public void setAverageProductionBudget(BigDecimal averageProductionBudget)
	{
		this.averageProductionBudget = averageProductionBudget;
	}
	
	@Caption("TotalWorldwideBoxOffice")
	@Column(name = "total_worldwide_boxOffice", columnDefinition = "DECIMAL", scale = 4)
	public BigDecimal getTotalWorldwideBoxOffice()
	{
		return this.totalWorldwideBoxOffice;
	}
	
	public void setTotalWorldwideBoxOffice(BigDecimal totalWorldwideBoxOffice)
	{
		this.totalWorldwideBoxOffice = totalWorldwideBoxOffice;
	}
	
}
