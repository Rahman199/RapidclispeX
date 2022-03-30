package com.develogment.sod.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Inventory.class)
public abstract class Inventory_ {

	public static volatile SingularAttribute<Inventory, Date> lastUpdate;
	public static volatile SingularAttribute<Inventory, Integer> inventoryId;
	public static volatile SetAttribute<Inventory, Rental> rentals_1;
	public static volatile SetAttribute<Inventory, Rental> rentals_1_1;
	public static volatile SingularAttribute<Inventory, Film> film;
	public static volatile SingularAttribute<Inventory, Store> store;

	public static final String LAST_UPDATE = "lastUpdate";
	public static final String INVENTORY_ID = "inventoryId";
	public static final String RENTALS_1 = "rentals_1";
	public static final String RENTALS_1_1 = "rentals_1_1";
	public static final String FILM = "film";
	public static final String STORE = "store";

}

