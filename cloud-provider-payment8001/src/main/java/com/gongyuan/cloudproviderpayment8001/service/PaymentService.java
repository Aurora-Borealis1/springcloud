package com.gongyuan.cloudproviderpayment8001.service;

import com.gongyuan.cloudproviderpayment8001.model.Payment;

public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById( Long id);
}
