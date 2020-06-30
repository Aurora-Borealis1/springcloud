package com.gongyuan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author taowangwang
 * @date 2020/6/30 22:07
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderNacosApplication84 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosApplication84.class,args);
    }
}
