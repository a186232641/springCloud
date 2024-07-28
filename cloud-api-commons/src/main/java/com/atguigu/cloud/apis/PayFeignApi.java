package com.atguigu.cloud.apis;

import cn.hutool.core.util.IdUtil;
import com.atguigu.cloud.entities.PayDTO;
import com.atguigu.cloud.resp.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.concurrent.TimeUnit;

/**
 * @author 韩飞龙
 * @version 1.0
 * 2024/7/27
 */
@FeignClient(value = "cloud-payment-service")
public interface PayFeignApi {
   @PostMapping("/pay/add")
   public ResultData addPay(@RequestBody PayDTO payDTO);
   @GetMapping("/pay/get/{id}")
   public ResultData getPayInfo(@PathVariable(value = "id") Integer id);
   @GetMapping("/pay/get/info")
   public String mylb();
   //=========Resilience4j CircuitBreaker 的例子
   @GetMapping(value = "/pay/circuit/{id}")
   public String myCircuit(@PathVariable("id") Integer id);

   //=========Resilience4j bulkhead 的例子
   @GetMapping(value = "/pay/bulkhead/{id}")
   public String myBulkhead(@PathVariable("id") Integer id);
   @GetMapping(value = "/pay/ratelimit/{id}")
   public String myRatelimit(@PathVariable("id") Integer id);
   @GetMapping(value = "/pay/micrometer/{id}")
   public String myMicrometer(@PathVariable("id") Integer id);
   @GetMapping(value = "/pay/gateway/get/{id}")
   public ResultData getById(@PathVariable("id") Integer id);
   @GetMapping(value = "/pay/gateway/info")
   public ResultData<String> getGatewayInfo();
}
