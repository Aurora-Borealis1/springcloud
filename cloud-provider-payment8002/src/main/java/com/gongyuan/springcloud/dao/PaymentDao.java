package com.gongyuan.springcloud.dao;

import com.gongyuan.springcloud.model.Payment;
import org.apache.ibatis.annotations.Param;


public interface PaymentDao {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
