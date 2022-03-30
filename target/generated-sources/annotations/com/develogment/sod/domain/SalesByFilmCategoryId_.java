package com.develogment.sod.domain;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SalesByFilmCategoryId.class)
public abstract class SalesByFilmCategoryId_ {

	public static volatile SingularAttribute<SalesByFilmCategoryId, BigDecimal> totalSales;
	public static volatile SingularAttribute<SalesByFilmCategoryId, String> category;

	public static final String TOTAL_SALES = "totalSales";
	public static final String CATEGORY = "category";

}

