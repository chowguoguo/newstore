package com.quechao.mobile.enums;

import lombok.Getter;

@Getter
public enum MobPageStatusEnum implements CodeEnum{

    UP(0,"上架"),
    DOWN(1,"下架"),
    ;

    private Integer code;

    private String message;

    MobPageStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
