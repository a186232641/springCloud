package com.atguigu.cloud.controller;

import cn.hutool.core.util.IdUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author 韩飞龙
 * @version 1.0
 * 2024/7/28
 */
@RestController
public class PayCircuitController {
   //=========Resilience4j CircuitBreaker 的例子
   @GetMapping(value = "/pay/circuit/{id}")
   public String myCircuit(@PathVariable("id") Integer id)
   {
      if(id == -4) throw new RuntimeException("----circuit id 不能负数");
      if(id == 9999){
         try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e) { e.printStackTrace(); }
      }
      return "Hello, circuit! inputId:  "+id+" \t " + IdUtil.simpleUUID();
   }
   @GetMapping(value = "/pay/bulkhead/{id}")
   public String myBulkhead(@PathVariable("id") Integer id)
   {
      if(id == -4) throw new RuntimeException("----bulkhead id 不能-4");

      if(id == 9999)
      {
         try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e) { e.printStackTrace(); }
      }

      return "Hello, bulkhead! inputId:  "+id+" \t " + IdUtil.simpleUUID();
   }
   @GetMapping(value = "/pay/ratelimit/{id}")
   public String myRatelimit(@PathVariable("id") Integer id){
      return "Hello, myRatelimit! inputId:  "+id+" \t " + IdUtil.simpleUUID();
   }
}
