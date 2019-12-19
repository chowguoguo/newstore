package com.quechao.order.enums;

public enum  OrderEnums {

    NON_PAYMENT(0,"未付款"),
    WAITING_FOR_DELIVERED(1,"待发货"),
    DELIVERED(2,"已发货"),
    FINISHED(3,"已完成"),
    CENCELED(4,"已取消"),
    RETURN_GOODS_VERIFY(14,"退单审核"),
    AGGREE_RETURN(8,"同意退货"),
    REFUSE_RETURN(9,"拒绝退货"),
    WAITTING_FOR_BUSINESS_RECEIEVE(10,"等待商家收货"),
    FINISH_RETURN(11,"结束退档"),
    RETURN_MONEY_VERIFY(15,"退款审核中"),
    REFUSE_RETURN_MONEY(13,"拒绝退款"),
    BUSINESS_DELIVERED_FAILED(16,"商家收货失败"),
    RETURNED_MONEY(17,"退款成功")
    ;
    
    private Integer code;

    private String message;

     OrderEnums(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
