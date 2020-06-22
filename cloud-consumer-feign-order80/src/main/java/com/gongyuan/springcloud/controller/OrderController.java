package com.gongyuan.springcloud.controller;

import com.gongyuan.springcloud.model.CommonResult;
import com.gongyuan.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable Long id){
        return paymentFeignService.getPaymentById(id);
    }
    @GetMapping("/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        return paymentFeignService.paymentFeignTimeout();
    }
}
