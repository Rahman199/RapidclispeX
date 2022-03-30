package com.develogment.sod.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Customer.class)
public abstract class Customer_ {

	public static volatile SingularAttribute<Customer, String> lastName;
	public static volatile SingularAttribute<Customer, Address> address;
	public static volatile SetAttribute<Customer, Payment> payments;
	public static volatile SingularAttribute<Customer, String> mime;
	public static volatile SingularAttribute<Customer, Boolean> active;
	public static volatile SingularAttribute<Customer, Store> store;
	public static volatile SetAttribute<Customer, Rental> rentals;
	public static volatile SingularAttribute<Customer, byte[]> picture;
	public static volatile SingularAttribute<Customer, String> firstName;
	public static volatile SingularAttribute<Customer, Date> lastUpdate;
	public static volatile SingularAttribute<Customer, Short> customerId;
	public static volatile SetAttribute<Customer, Rental> rentals_1;
	public static volatile SetAttribute<Customer, Payment> payments_1;
	public static volatile SingularAttribute<Customer, String> email;
	public static volatile SingularAttribute<Customer, Date> createDate;

	public static final String LAST_NAME = "lastName";
	public static final String ADDRESS = "address";
	public static final String PAYMENTS = "payments";
	public static final String MIME = "mime";
	public static final String ACTIVE = "active";
	public static final String STORE = "store";
	public static final String RENTALS = "rentals";
	public static final String PICTURE = "picture";
	public static final String FIRST_NAME = "firstName";
	public static final String LAST_UPDATE = "lastUpdate";
	public static final String CUSTOMER_ID = "customerId";
	public static final String RENTALS_1 = "rentals_1";
	public static final String PAYMENTS_1 = "payments_1";
	public static final String EMAIL = "email";
	public static final String CREATE_DATE = "createDate";

}

