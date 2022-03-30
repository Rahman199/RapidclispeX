package com.develogment.sod.domain;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SalesByStoreId.class)
public abstract class SalesByStoreId_ {

	public static volatile SingularAttribute<SalesByStoreId, String> manager;
	public static volatile SingularAttribute<SalesByStoreId, BigDecimal> totalSales;
	public static volatile SingularAttribute<SalesByStoreId, String> store;

	public static final String MANAGER = "manager";
	public static final String TOTAL_SALES = "totalSales";
	public static final String STORE = "store";

}

