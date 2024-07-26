package com.atguigu.cloud.controller;

import com.atguigu.cloud.entities.Pay;
import com.atguigu.cloud.entities.PayDTO;
import com.atguigu.cloud.service.PayService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 韩飞龙
 * @version 1.0
 * 2024/7/26
 */
@RestController
@Slf4j
public class PayController {

    @Resource
    PayService payService;
@PostMapping("/pay/add")
    public String addPay(@RequestBody Pay pay){
    log.info("/pay/add  入参为{}",pay.toString());
    int i = payService.add(pay);
    return "成功插入记录，返回值："+i;
}
@DeleteMapping("/pay/del/{id}")
public Integer deletePay(@PathVariable("id") Integer id){
    log.info("/pay/del/{id}  入参为{}",id.toString());
return payService.delete(id);
}
@PutMapping("/pay/update")
public String updatePay(@RequestBody PayDTO payDTO){
    log.info("/pay/update  入参为{}",payDTO.toString());
    Pay pay = new Pay();
    BeanUtils.copyProperties(payDTO,pay);
    return "成功更新记录" + payService.update(pay);
}
@GetMapping("/pay/get/{id}")
    public Pay getById(@PathVariable("id") Integer id){
    Pay pay = payService.getById(id);
    return pay;
}
@GetMapping("/pay/getAll")
    public List<Pay> getAll(){
    return payService.getAll();
}
}
