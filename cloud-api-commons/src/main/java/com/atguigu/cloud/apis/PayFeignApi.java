package com.atguigu.cloud.apis;

import com.atguigu.cloud.entities.PayDTO;
import com.atguigu.cloud.resp.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
}
