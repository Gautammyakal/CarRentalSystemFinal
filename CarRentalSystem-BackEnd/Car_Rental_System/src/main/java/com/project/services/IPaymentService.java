package com.project.services;

import com.project.dto.BookingPayment;
import com.project.entities.Payment;

public interface IPaymentService {
	Payment savePaymentDetails(BookingPayment payment) throws Exception;
	String updatePaymentDetails(BookingPayment payment) throws Exception;

}
