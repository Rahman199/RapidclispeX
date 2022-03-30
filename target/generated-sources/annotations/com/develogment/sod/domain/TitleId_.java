package com.develogment.sod.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TitleId.class)
public abstract class TitleId_ {

	public static volatile SingularAttribute<TitleId, Date> fromDate;
	public static volatile SingularAttribute<TitleId, Integer> empNo;
	public static volatile SingularAttribute<TitleId, String> title;

	public static final String FROM_DATE = "fromDate";
	public static final String EMP_NO = "empNo";
	public static final String TITLE = "title";

}

