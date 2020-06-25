package com.gongyuan.springcloud.service;

public interface PaymentService {
    String paymentInfo_OK(Long id);
    String paymentInfo_TimeOut(Long id);
    String paymentCircuitBreaker( Integer id);
}
