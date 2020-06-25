package com.gongyuan.springcloud.controller;

import com.gongyuan.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@DefaultProperties(defaultFallback = "paymentInfo_TimeOutGlobalFallbackMethod")
public class OrderHystrixController {
    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping(value = "/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable(value = "id") Long id){
        String result = paymentHystrixService.paymentInfo_OK(id);
        return result;
    }
    /*@HystrixCommand(fallbackMethod = "paymentInfo_TimeOutFallbackMethod",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
    })*/
    @HystrixCommand
    @GetMapping(value = "/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable(value = "id") Long id){
        String result = paymentHystrixService.paymentInfo_TimeOut(id);
        return result;
    }


    public String paymentInfo_TimeOutFallbackMethod(){
        return "我是80消费者，系统繁忙或运行报错，请稍后再试,o(╥﹏╥)o";
    }

    public String paymentInfo_TimeOutGlobalFallbackMethod(){
        return "全局异常，请稍后再试,o(╥﹏╥)o";
    }
}
