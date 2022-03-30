package com.develogment.sod.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Rental.class)
public abstract class Rental_ {

	public static volatile SingularAttribute<Rental, Date> rentalDate;
	public static volatile SingularAttribute<Rental, Date> returnDate;
	public static volatile SingularAttribute<Rental, Date> lastUpdate;
	public static volatile SetAttribute<Rental, Payment> payments;
	public static volatile SingularAttribute<Rental, Staff> staff;
	public static volatile SingularAttribute<Rental, Inventory> inventory;
	public static volatile SetAttribute<Rental, Payment> payments_1;
	public static volatile SingularAttribute<Rental, Integer> rentalId;
	public static volatile SingularAttribute<Rental, Customer> customer;

	public static final String RENTAL_DATE = "rentalDate";
	public static final String RETURN_DATE = "returnDate";
	public static final String LAST_UPDATE = "lastUpdate";
	public static final String PAYMENTS = "payments";
	public static final String STAFF = "staff";
	public static final String INVENTORY = "inventory";
	public static final String PAYMENTS_1 = "payments_1";
	public static final String RENTAL_ID = "rentalId";
	public static final String CUSTOMER = "customer";

}

