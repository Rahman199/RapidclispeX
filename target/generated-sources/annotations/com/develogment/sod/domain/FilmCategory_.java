package com.develogment.sod.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FilmCategory.class)
public abstract class FilmCategory_ {

	public static volatile SingularAttribute<FilmCategory, Date> lastUpdate;
	public static volatile SingularAttribute<FilmCategory, FilmCategoryId> id;
	public static volatile SingularAttribute<FilmCategory, Film> film;
	public static volatile SingularAttribute<FilmCategory, Category> category;

	public static final String LAST_UPDATE = "lastUpdate";
	public static final String ID = "id";
	public static final String FILM = "film";
	public static final String CATEGORY = "category";

}

