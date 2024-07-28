package com.atguigu.cloud.exp;

import com.atguigu.cloud.resp.ResultData;
import com.atguigu.cloud.resp.ReturnCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 韩飞龙
 * @version 1.0
 * 2024/7/27
 * @RestControllerAdvice 是 Spring Framework 中的一个注解，用于集中处理所有 @RestController 控制器中的异常。
 * 它是 @ControllerAdvice 和 @ResponseBody 的组合，提供了一个全局的异常处理机制，特别适用于 RESTful 风格的 Web 服务。
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(HttpStatus.ACCEPTED)
//    public ResultData<String> exception(Exception e){
//        System.out.println("###come in GlobalExceptionHandler");
//        log.error("全局异常信息:{}",e.getMessage(),e);
//        return ResultData.fail(ReturnCodeEnum.RC500.getCode(), ReturnCodeEnum.RC500.getMessage());
//    }
}
