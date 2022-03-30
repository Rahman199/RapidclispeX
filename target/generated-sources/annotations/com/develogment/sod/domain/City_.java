package com.develogment.sod.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(City.class)
public abstract class City_ {

	public static volatile SingularAttribute<City, Country> country;
	public static volatile SetAttribute<City, Address> addresses;
	public static volatile SetAttribute<City, Address> addresses_1;
	public static volatile SingularAttribute<City, String> city;
	public static volatile SingularAttribute<City, Date> lastUpdate;
	public static volatile SingularAttribute<City, Short> cityId;

	public static final String COUNTRY = "country";
	public static final String ADDRESSES = "addresses";
	public static final String ADDRESSES_1 = "addresses_1";
	public static final String CITY = "city";
	public static final String LAST_UPDATE = "lastUpdate";
	public static final String CITY_ID = "cityId";

}

