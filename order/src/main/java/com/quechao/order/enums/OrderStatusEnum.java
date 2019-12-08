package com.quechao.order.enums;

import lombok.Getter;

@Getter
public enum OrderStatusEnum implements CodeEnum {
    NEW(0, "未付款"),
    PAYED(1, "已付款未发货"),
    SENDED(2, "已发货"),
    RECEIVED(3, "已收货"),
    CANCELED(4, "作废"),
    APPLY_RETURN_GOODS(7, "申请退货"),
    ACCEPT_RETURN_GOODS(8, "同意退货"),
    REFUSE_RETURN_GOODS(9, "拒绝退货"),
    SUCCESS_RETURN(11, "退货成功"),
    ACCEPT_RETURN_MONEY(12, "同意退款"),
    REFUSE_RETURN_MONEY(13, "拒绝退款"),
    CHECK_RETURN_GOODS(14, "退货审核"),
    CHECK_RETURN_MONEY(15, "退款审核"),
    BUSINESS_RECEIVE_GOODS_FAILURE(16, "商家收货失败"),
    SUCCESS_RETURN_MONEY(17, "退款成功");

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
