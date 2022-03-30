package com.develogment.sod.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Language.class)
public abstract class Language_ {

	public static volatile SetAttribute<Language, Film> filmsForLanguageId_1;
	public static volatile SetAttribute<Language, Film> filmsForOriginalLanguageId_1;
	public static volatile SingularAttribute<Language, Date> lastUpdate;
	public static volatile SingularAttribute<Language, Short> languageId;
	public static volatile SingularAttribute<Language, String> name;
	public static volatile SetAttribute<Language, Film> filmsForLanguageId_1_1;
	public static volatile SetAttribute<Language, Film> filmsForOriginalLanguageId_1_1;

	public static final String FILMS_FOR_LANGUAGE_ID_1 = "filmsForLanguageId_1";
	public static final String FILMS_FOR_ORIGINAL_LANGUAGE_ID_1 = "filmsForOriginalLanguageId_1";
	public static final String LAST_UPDATE = "lastUpdate";
	public static final String LANGUAGE_ID = "languageId";
	public static final String NAME = "name";
	public static final String FILMS_FOR_LANGUAGE_ID_1_1 = "filmsForLanguageId_1_1";
	public static final String FILMS_FOR_ORIGINAL_LANGUAGE_ID_1_1 = "filmsForOriginalLanguageId_1_1";

}

