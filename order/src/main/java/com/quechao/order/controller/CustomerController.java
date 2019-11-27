package com.quechao.order.controller;

import com.quechao.order.enums.result.OrderResultEnum;
import com.quechao.order.exception.OrderException;
import com.quechao.order.form.OrderForm;
import com.quechao.order.vo.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Map;

@Controller
@RequestMapping("/buyer/order")
@Slf4j
public class CustomerController {

    @PostMapping("create")
    public ResultVo<Map<String,String>> createOrder(@Valid OrderForm orderForm, BindingResult bindingResult){

        if (bindingResult.hasErrors()){
            log.error("传入参数异常，orderForm={}",orderForm);
            log.error(bindingResult.getFieldError().getDefaultMessage());
            throw new OrderException(OrderResultEnum.ORDER_PARAM_ERROR.getCode(),bindingResult.getFieldError().getDefaultMessage());
        }
        System.out.println("adfadsfas");
        return  null;
    }
}
