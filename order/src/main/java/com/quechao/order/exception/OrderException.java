package com.quechao.order.exception;

import com.quechao.order.enums.result.OrderResultEnum;

public class OrderException  extends RuntimeException{

    private  Integer code;

    public  OrderException(OrderResultEnum orderResultEnum){

        super(orderResultEnum.getMessage());
        this.code = orderResultEnum.getCode();

    }

    public  OrderException(Integer code,String message){
        super(message);
        this.code = code;
    }

}
