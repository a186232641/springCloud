package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 韩飞龙
 * @version 1.0
 * 2024/7/26
 */
@SpringBootApplication
@MapperScan("com.atguigu.cloud.mapper")
public class Main8001 {

    public static void main(String[] args) {
        SpringApplication.run(Main8001.class,args);
    }
}