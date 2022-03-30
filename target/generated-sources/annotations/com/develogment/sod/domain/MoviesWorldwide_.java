package com.develogment.sod.domain;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MoviesWorldwide.class)
public abstract class MoviesWorldwide_ {

	public static volatile SingularAttribute<MoviesWorldwide, BigDecimal> noOfMovies;
	public static volatile SingularAttribute<MoviesWorldwide, BigDecimal> averageProductionBudget;
	public static volatile SingularAttribute<MoviesWorldwide, BigDecimal> totalWorldwideBoxOffice;
	public static volatile SingularAttribute<MoviesWorldwide, Integer> id;
	public static volatile SingularAttribute<MoviesWorldwide, String> productionCountries;

	public static final String NO_OF_MOVIES = "noOfMovies";
	public static final String AVERAGE_PRODUCTION_BUDGET = "averageProductionBudget";
	public static final String TOTAL_WORLDWIDE_BOX_OFFICE = "totalWorldwideBoxOffice";
	public static final String ID = "id";
	public static final String PRODUCTION_COUNTRIES = "productionCountries";

}

