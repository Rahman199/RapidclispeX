package com.develogment.sod.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Productsstore.class)
public abstract class Productsstore_ {

	public static volatile SingularAttribute<Productsstore, String> storeName;
	public static volatile SingularAttribute<Productsstore, Integer> id;
	public static volatile SetAttribute<Productsstore, Sale> sales;

	public static final String STORE_NAME = "storeName";
	public static final String ID = "id";
	public static final String SALES = "sales";

}

