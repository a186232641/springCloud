package com.atguigu.cloud.controller;

import com.atguigu.cloud.apis.PayFeignApi;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 韩飞龙
 * @version 1.0
 * 2024/7/28
 */
@RestController
@Slf4j
public class OrderMicrometerController {
   @Resource
   private PayFeignApi payFeignApi;
   @GetMapping(value = "/feign/micrometer/{id}")
   public String myMicrometer(@PathVariable("id") Integer id)
   {
      return payFeignApi.myMicrometer(id);
   }
}
