package com.gongyuan.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderZKController {
    public static final String INVOKE_UR = "http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo(){
        return restTemplate.getForObject(INVOKE_UR+"/payment/zk",String.class);
    }
}
