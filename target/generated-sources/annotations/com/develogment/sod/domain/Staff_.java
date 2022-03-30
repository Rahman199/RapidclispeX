package com.develogment.sod.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Staff.class)
public abstract class Staff_ {

	public static volatile SingularAttribute<Staff, String> lastName;
	public static volatile SingularAttribute<Staff, Address> address;
	public static volatile SetAttribute<Staff, Store> stores;
	public static volatile SetAttribute<Staff, Payment> payments;
	public static volatile SingularAttribute<Staff, Boolean> active;
	public static volatile SingularAttribute<Staff, Store> store;
	public static volatile SetAttribute<Staff, Rental> rentals;
	public static volatile SingularAttribute<Staff, byte[]> picture;
	public static volatile SingularAttribute<Staff, String> firstName;
	public static volatile SingularAttribute<Staff, String> password;
	public static volatile SingularAttribute<Staff, Date> lastUpdate;
	public static volatile SetAttribute<Staff, Rental> rentals_1;
	public static volatile SetAttribute<Staff, Payment> payments_1;
	public static volatile SingularAttribute<Staff, Short> staffId;
	public static volatile SingularAttribute<Staff, String> email;
	public static volatile SetAttribute<Staff, Store> stores_1;
	public static volatile SingularAttribute<Staff, String> username;

	public static final String LAST_NAME = "lastName";
	public static final String ADDRESS = "address";
	public static final String STORES = "stores";
	public static final String PAYMENTS = "payments";
	public static final String ACTIVE = "active";
	public static final String STORE = "store";
	public static final String RENTALS = "rentals";
	public static final String PICTURE = "picture";
	public static final String FIRST_NAME = "firstName";
	public static final String PASSWORD = "password";
	public static final String LAST_UPDATE = "lastUpdate";
	public static final String RENTALS_1 = "rentals_1";
	public static final String PAYMENTS_1 = "payments_1";
	public static final String STAFF_ID = "staffId";
	public static final String EMAIL = "email";
	public static final String STORES_1 = "stores_1";
	public static final String USERNAME = "username";

}

