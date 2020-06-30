package com.gongyuan.springcloud;

import com.gongyuan.springcloud.dao.PaymentDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class CloudProviderPayment8001ApplicationTests {

    @Autowired
    private ApplicationContext context;

    @Test
    void contextLoads() {
    }

    @Test
    void test01(){
        PaymentDao paymentDao = context.getBean(PaymentDao.class);
    }

}
