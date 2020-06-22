package com.gongyuan.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyOwnRule {
    @Bean
    public IRule iRule(){
        //随机轮询策略
        return new RandomRule();
    }
}
