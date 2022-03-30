package com.develogment.sod.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Payment.class)
public abstract class Payment_ {

	public static volatile SingularAttribute<Payment, BigDecimal> amount;
	public static volatile SingularAttribute<Payment, Short> paymentId;
	public static volatile SingularAttribute<Payment, Date> lastUpdate;
	public static volatile SingularAttribute<Payment, Staff> staff;
	public static volatile SingularAttribute<Payment, Date> paymentDate;
	public static volatile SingularAttribute<Payment, Customer> customer;
	public static volatile SingularAttribute<Payment, Rental> rental;

	public static final String AMOUNT = "amount";
	public static final String PAYMENT_ID = "paymentId";
	public static final String LAST_UPDATE = "lastUpdate";
	public static final String STAFF = "staff";
	public static final String PAYMENT_DATE = "paymentDate";
	public static final String CUSTOMER = "customer";
	public static final String RENTAL = "rental";

}

