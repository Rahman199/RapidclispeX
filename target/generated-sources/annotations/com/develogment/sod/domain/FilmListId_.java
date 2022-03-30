package com.develogment.sod.domain;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FilmListId.class)
public abstract class FilmListId_ {

	public static volatile SingularAttribute<FilmListId, Short> fid;
	public static volatile SingularAttribute<FilmListId, String> actors;
	public static volatile SingularAttribute<FilmListId, BigDecimal> price;
	public static volatile SingularAttribute<FilmListId, Short> length;
	public static volatile SingularAttribute<FilmListId, String> rating;
	public static volatile SingularAttribute<FilmListId, String> description;
	public static volatile SingularAttribute<FilmListId, String> title;
	public static volatile SingularAttribute<FilmListId, String> category;

	public static final String FID = "fid";
	public static final String ACTORS = "actors";
	public static final String PRICE = "price";
	public static final String LENGTH = "length";
	public static final String RATING = "rating";
	public static final String DESCRIPTION = "description";
	public static final String TITLE = "title";
	public static final String CATEGORY = "category";

}

