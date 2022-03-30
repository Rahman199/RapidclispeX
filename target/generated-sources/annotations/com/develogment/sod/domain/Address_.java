package com.develogment.sod.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Address.class)
public abstract class Address_ {

	public static volatile SingularAttribute<Address, String> address;
	public static volatile SingularAttribute<Address, City> city;
	public static volatile SingularAttribute<Address, String> address2;
	public static volatile SetAttribute<Address, Store> stores;
	public static volatile SingularAttribute<Address, String> postalCode;
	public static volatile SetAttribute<Address, Customer> customers_1;
	public static volatile SetAttribute<Address, Staff> staffs_1;
	public static volatile SetAttribute<Address, Staff> staffs_1_1;
	public static volatile SingularAttribute<Address, Short> addressId;
	public static volatile SetAttribute<Address, Customer> customers_1_1;
	public static volatile SingularAttribute<Address, String> phone;
	public static volatile SingularAttribute<Address, String> district;
	public static volatile SingularAttribute<Address, Date> lastUpdate;
	public static volatile SingularAttribute<Address, byte[]> location;
	public static volatile SetAttribute<Address, Store> stores_1;

	public static final String ADDRESS = "address";
	public static final String CITY = "city";
	public static final String ADDRESS2 = "address2";
	public static final String STORES = "stores";
	public static final String POSTAL_CODE = "postalCode";
	public static final String CUSTOMERS_1 = "customers_1";
	public static final String STAFFS_1 = "staffs_1";
	public static final String STAFFS_1_1 = "staffs_1_1";
	public static final String ADDRESS_ID = "addressId";
	public static final String CUSTOMERS_1_1 = "customers_1_1";
	public static final String PHONE = "phone";
	public static final String DISTRICT = "district";
	public static final String LAST_UPDATE = "lastUpdate";
	public static final String LOCATION = "location";
	public static final String STORES_1 = "stores_1";

}

