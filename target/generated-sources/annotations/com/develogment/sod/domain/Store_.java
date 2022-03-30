package com.develogment.sod.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Store.class)
public abstract class Store_ {

	public static volatile SingularAttribute<Store, Address> address;
	public static volatile SetAttribute<Store, Customer> customers_1_1;
	public static volatile SetAttribute<Store, Inventory> inventories;
	public static volatile SetAttribute<Store, Inventory> inventories_1;
	public static volatile SingularAttribute<Store, Date> lastUpdate;
	public static volatile SetAttribute<Store, Customer> customers_1;
	public static volatile SetAttribute<Store, Staff> staffs_1;
	public static volatile SingularAttribute<Store, Staff> staff;
	public static volatile SetAttribute<Store, Staff> staffs_1_1;
	public static volatile SingularAttribute<Store, Short> storeId;

	public static final String ADDRESS = "address";
	public static final String CUSTOMERS_1_1 = "customers_1_1";
	public static final String INVENTORIES = "inventories";
	public static final String INVENTORIES_1 = "inventories_1";
	public static final String LAST_UPDATE = "lastUpdate";
	public static final String CUSTOMERS_1 = "customers_1";
	public static final String STAFFS_1 = "staffs_1";
	public static final String STAFF = "staff";
	public static final String STAFFS_1_1 = "staffs_1_1";
	public static final String STORE_ID = "storeId";

}

