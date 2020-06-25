package com.gongyuan.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymenHystrixServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Long id) {
        return "PaymentHystrixService-fallback---paymentInfo_OK---o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Long id) {
        return "PaymentHystrixService-fallback---paymentInfo_TimeOut---o(╥﹏╥)o";
    }
}
