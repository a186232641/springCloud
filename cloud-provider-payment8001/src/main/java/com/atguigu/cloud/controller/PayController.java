package com.atguigu.cloud.controller;

import com.atguigu.cloud.entities.Pay;
import com.atguigu.cloud.entities.PayDTO;
import com.atguigu.cloud.resp.ResultData;
import com.atguigu.cloud.service.PayService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "支付微服务模块", description = "支付CRUD")
public class PayController {

    @Resource
    PayService payService;

    @PostMapping("/pay/add")
    @Operation(summary = "新增", description = "新增支付流水方法")
    public ResultData<String> addPay(@RequestBody Pay pay) {
        log.info("/pay/add  入参为{}", pay.toString());
        int i = payService.add(pay);
        return ResultData.success("成功插入记录，返回值：" + i);
    }

    @Operation(summary = "删除", description = "删除支付流水方法")
    @DeleteMapping("/pay/del/{id}")
    public ResultData<Integer> deletePay(@PathVariable("id") Integer id) {
        log.info("/pay/del/{id}  入参为{}", id.toString());
        return ResultData.success(payService.delete(id));
    }

    @Operation(summary = "更新", description = "更新支付流水方法")
    @PutMapping("/pay/update")
    public ResultData<String> updatePay(@RequestBody PayDTO payDTO) {
        log.info("/pay/update  入参为{}", payDTO.toString());
        Pay pay = new Pay();
        BeanUtils.copyProperties(payDTO, pay);
        return ResultData.success("成功更新记录" + payService.update(pay));
    }

    @Operation(summary = "查询", description = "根据id查询")
    @GetMapping("/pay/get/{id}")
    public ResultData<Pay> getById(@PathVariable("id") Integer id) {
        if(id<0){
            throw new RuntimeException("传入的id不合法");
        }
        Pay pay = payService.getById(id);
        return ResultData.success(pay);
    }

    @Operation(summary = "查询全部", description = "查询全部支付流水方法")
    @GetMapping("/pay/getAll")
    public ResultData<List<Pay>> getAll() {
        return ResultData.success(payService.getAll());
    }
}
