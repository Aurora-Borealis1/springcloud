package com.gongyuan.springcloud.service.impl;

import com.gongyuan.springcloud.dao.PaymentDao;
import com.gongyuan.springcloud.model.Payment;
import com.gongyuan.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
