package com.develogment.sod.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Country.class)
public abstract class Country_ {

	public static volatile SingularAttribute<Country, String> country;
	public static volatile SetAttribute<Country, City> cities;
	public static volatile SingularAttribute<Country, Date> lastUpdate;
	public static volatile SetAttribute<Country, City> cities_1;
	public static volatile SingularAttribute<Country, Short> countryId;

	public static final String COUNTRY = "country";
	public static final String CITIES = "cities";
	public static final String LAST_UPDATE = "lastUpdate";
	public static final String CITIES_1 = "cities_1";
	public static final String COUNTRY_ID = "countryId";

}

