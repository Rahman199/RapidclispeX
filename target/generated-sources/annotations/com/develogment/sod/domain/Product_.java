package com.develogment.sod.domain;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Product.class)
public abstract class Product_ {

	public static volatile SingularAttribute<Product, byte[]> image;
	public static volatile SingularAttribute<Product, BigDecimal> price;
	public static volatile SingularAttribute<Product, byte[]> description;
	public static volatile SingularAttribute<Product, Integer> id;
	public static volatile SingularAttribute<Product, String> productName;

	public static final String IMAGE = "image";
	public static final String PRICE = "price";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String PRODUCT_NAME = "productName";

}

