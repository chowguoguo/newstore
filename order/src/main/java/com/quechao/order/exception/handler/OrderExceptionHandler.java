package com.quechao.order.exception.handler;

import com.quechao.order.exception.OrderException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.Console;

@ControllerAdvice
public class OrderExceptionHandler {

    @ExceptionHandler(value = OrderException.class)
    public void orderException() {
        System.out.println("订单创建异常");
    }

}
