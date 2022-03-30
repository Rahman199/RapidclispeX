package com.develogment.sod.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FilmText.class)
public abstract class FilmText_ {

	public static volatile SingularAttribute<FilmText, Short> filmId;
	public static volatile SingularAttribute<FilmText, String> description;
	public static volatile SingularAttribute<FilmText, String> title;

	public static final String FILM_ID = "filmId";
	public static final String DESCRIPTION = "description";
	public static final String TITLE = "title";

}

