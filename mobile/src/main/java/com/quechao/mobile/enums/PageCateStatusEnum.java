package com.quechao.mobile.enums;

public enum  PageCateStatusEnum {

    DOWN(1,"上架"),
    UP(0,"下架"),
    ;

    private Integer statusCode;

    private String message;

    PageCateStatusEnum(Integer statusCode,String message) {
        this.statusCode = statusCode;
        this.message = message;
    }
}
