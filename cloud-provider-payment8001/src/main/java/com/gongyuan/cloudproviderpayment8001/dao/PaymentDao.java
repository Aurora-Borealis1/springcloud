package com.gongyuan.cloudproviderpayment8001.dao;

import com.gongyuan.cloudproviderpayment8001.model.Payment;
import org.apache.ibatis.annotations.Param;


public interface PaymentDao {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
