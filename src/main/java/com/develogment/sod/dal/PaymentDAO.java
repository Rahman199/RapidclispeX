
package com.develogment.sod.dal;

import com.rapidclipse.framework.server.jpa.dal.JpaDataAccessObject;
import com.develogment.sod.domain.Payment;


/**
 * Home object for domain model class Payment.
 * 
 * @see Payment
 */
public class PaymentDAO extends JpaDataAccessObject.Default<Payment, Short>
{
	public final static PaymentDAO INSTANCE = new PaymentDAO();
	
	public PaymentDAO()
	{
		super(Payment.class);
	}
}
