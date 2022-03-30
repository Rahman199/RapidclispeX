package com.develogment.sod.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Film.class)
public abstract class Film_ {

	public static volatile SingularAttribute<Film, BigDecimal> rentalRate;
	public static volatile SetAttribute<Film, FilmCategory> filmCategories_1;
	public static volatile SingularAttribute<Film, Short> rentalDuration;
	public static volatile SingularAttribute<Film, Language> languageByLanguageId;
	public static volatile SingularAttribute<Film, Short> length;
	public static volatile SingularAttribute<Film, String> rating;
	public static volatile SingularAttribute<Film, String> description;
	public static volatile SingularAttribute<Film, BigDecimal> replacementCost;
	public static volatile SingularAttribute<Film, String> title;
	public static volatile SetAttribute<Film, FilmActor> filmActors;
	public static volatile SingularAttribute<Film, Language> languageByOriginalLanguageId;
	public static volatile SingularAttribute<Film, String> specialFeatures;
	public static volatile SetAttribute<Film, Inventory> inventories;
	public static volatile SetAttribute<Film, Inventory> inventories_1;
	public static volatile SingularAttribute<Film, Short> filmId;
	public static volatile SingularAttribute<Film, Date> lastUpdate;
	public static volatile SetAttribute<Film, FilmCategory> filmCategories_1_1;
	public static volatile SetAttribute<Film, FilmActor> filmActors_1;
	public static volatile SingularAttribute<Film, Date> releaseYear;

	public static final String RENTAL_RATE = "rentalRate";
	public static final String FILM_CATEGORIES_1 = "filmCategories_1";
	public static final String RENTAL_DURATION = "rentalDuration";
	public static final String LANGUAGE_BY_LANGUAGE_ID = "languageByLanguageId";
	public static final String LENGTH = "length";
	public static final String RATING = "rating";
	public static final String DESCRIPTION = "description";
	public static final String REPLACEMENT_COST = "replacementCost";
	public static final String TITLE = "title";
	public static final String FILM_ACTORS = "filmActors";
	public static final String LANGUAGE_BY_ORIGINAL_LANGUAGE_ID = "languageByOriginalLanguageId";
	public static final String SPECIAL_FEATURES = "specialFeatures";
	public static final String INVENTORIES = "inventories";
	public static final String INVENTORIES_1 = "inventories_1";
	public static final String FILM_ID = "filmId";
	public static final String LAST_UPDATE = "lastUpdate";
	public static final String FILM_CATEGORIES_1_1 = "filmCategories_1_1";
	public static final String FILM_ACTORS_1 = "filmActors_1";
	public static final String RELEASE_YEAR = "releaseYear";

}

