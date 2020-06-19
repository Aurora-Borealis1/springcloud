package com.gongyuan.springcloud.service;

import com.gongyuan.springcloud.model.Payment;

public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById( Long id);
}
