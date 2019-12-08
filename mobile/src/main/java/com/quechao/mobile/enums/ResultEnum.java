package com.quechao.mobile.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {
    PARAMETER_ERROR(0, "参数不正确");;
    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
