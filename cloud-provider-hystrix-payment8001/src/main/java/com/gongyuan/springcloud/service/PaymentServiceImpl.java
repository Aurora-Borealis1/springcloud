package com.gongyuan.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService{

    public String paymentInfo_OK(Long id){
        return "线程池"+ Thread.currentThread().getName()+"paymentInfo_OK,id:"+id+"\t"+"O(∩_∩)O哈哈~";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String paymentInfo_TimeOut(Long id){
        int second = 3;
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池"+ Thread.currentThread().getName()+"paymentInfo_OK,id:"+id+"\t"+"O(∩_∩)O哈哈~,耗时："+second+"秒";
    }

    public String paymentInfo_TimeOutHandler(Long id){
        return "线程池"+ Thread.currentThread().getName()+"系统繁忙或运行报错，请稍后再试,id:"+id+"\t"+"o(╥﹏╥)o";
    }
}
