package com.gongyuan.springcloud.service.impl;

import com.gongyuan.springcloud.model.CommonResult;
import com.gongyuan.springcloud.model.Payment;
import com.gongyuan.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @author taowangwang
 * @date 2020/6/30 22:10
 */

@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
