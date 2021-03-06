package com.nicklaus.servicebase.handler.exception;


import com.nicklaus.commonbase.ExceptionUtil;
import com.nicklaus.commonbase.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return Result.error().message("执行了全局异常处理...");
    }

    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public Result error(ArithmeticException e){
        e.printStackTrace();
        return Result.error().message("执行了ArithmeticException异常处理...");
    }

    @ExceptionHandler(NiloEduException.class)
    @ResponseBody
    public Result error(NiloEduException e){
        e.printStackTrace();
        log.error(ExceptionUtil.getMessage(e));
        return Result.error().code(e.getCode()).message(e.getMsg());
    }
}
