package com.develogment.sod.ui;

import com.develogment.sod.domain.Payment;
import java.io.File;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PaymentGrid.class)
public abstract class PaymentGrid_ {

	public static volatile SingularAttribute<PaymentGrid, File> file;
	public static volatile SingularAttribute<PaymentGrid, Payment> selectedPayment;

	public static final String FILE = "file";
	public static final String SELECTED_PAYMENT = "selectedPayment";

}

