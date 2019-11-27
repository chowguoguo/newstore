package com.quechao.order.enums.result;

import lombok.Getter;

@Getter
public enum  OrderResultEnum {
    ORDER_PARAM_ERROR(0,"订单参数错误"),
    ORDER_NOT_EXIST(1,"订单不存在"),
    ORDER_STATUS_ERROR(2,"订单状态错误"),
    SHOPPING_CART_EMPTY(3,"购物车为空，不能下单"),
    ORDER_PAY_STATUS_ERROR(4,"支付状态有误"),
    ;

    private Integer code;

    private String message;

    OrderResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
