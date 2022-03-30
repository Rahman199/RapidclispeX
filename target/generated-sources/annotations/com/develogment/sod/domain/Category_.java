package com.develogment.sod.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Category.class)
public abstract class Category_ {

	public static volatile SetAttribute<Category, FilmCategory> filmCategories_1;
	public static volatile SingularAttribute<Category, Date> lastUpdate;
	public static volatile SetAttribute<Category, FilmCategory> filmCategories_1_1;
	public static volatile SingularAttribute<Category, String> name;
	public static volatile SingularAttribute<Category, Short> categoryId;

	public static final String FILM_CATEGORIES_1 = "filmCategories_1";
	public static final String LAST_UPDATE = "lastUpdate";
	public static final String FILM_CATEGORIES_1_1 = "filmCategories_1_1";
	public static final String NAME = "name";
	public static final String CATEGORY_ID = "categoryId";

}

