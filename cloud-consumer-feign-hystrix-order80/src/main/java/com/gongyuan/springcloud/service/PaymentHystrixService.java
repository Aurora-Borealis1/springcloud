package com.gongyuan.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cloud-payment-service")
public interface PaymentHystrixService {
    @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable(value = "id") Long id);
    @GetMapping(value = "/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable(value = "id") Long id);
}
