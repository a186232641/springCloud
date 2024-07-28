package com.atguigu.cloud.controller;

import cn.hutool.core.util.IdUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 韩飞龙
 * @version 1.0
 * 2024/7/28
 */
@RestController
public class PayMicrometerController {
   @GetMapping(value = "/pay/micrometer/{id}")
   public String myMicrometer(@PathVariable("id") Integer id)
   {
      return "Hello, 欢迎到来myMicrometer inputId:  "+id+" \t    服务返回:" + IdUtil.simpleUUID();
   }
}
