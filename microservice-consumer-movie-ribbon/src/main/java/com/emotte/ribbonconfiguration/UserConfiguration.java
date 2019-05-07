package com.emotte.ribbonconfiguration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {

    @Autowired
    IClientConfig config;


    @Bean
    public IRule ribbonRule(IClientConfig config){
        return new RandomRule();
    }
}
