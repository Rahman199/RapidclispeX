package com.develogment.sod.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Sale.class)
public abstract class Sale_ {

	public static volatile SingularAttribute<Sale, Product> product;
	public static volatile SingularAttribute<Sale, Productsstore> productsstore;
	public static volatile SingularAttribute<Sale, BigDecimal> quantity;
	public static volatile SingularAttribute<Sale, Date> salesDate;
	public static volatile SingularAttribute<Sale, SaleId> id;

	public static final String PRODUCT = "product";
	public static final String PRODUCTSSTORE = "productsstore";
	public static final String QUANTITY = "quantity";
	public static final String SALES_DATE = "salesDate";
	public static final String ID = "id";

}

