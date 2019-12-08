package com.quechao.mobile.exception;

public class OperationException extends RuntimeException {

    private Integer code;

    public OperationException(Integer code, String message) {
        super(message);
        this.code = code;
    }

}
