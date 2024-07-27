package com.atguigu.cloud.config;

import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 韩飞龙
 * @version 1.0
 * 2024/7/27
 */
@Configuration
public class FeignConfig {
    @Bean
    public Retryer myRetryer(){
        return new Retryer.Default(100,1,3);
    }
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
