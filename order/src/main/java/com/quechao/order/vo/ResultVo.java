package com.quechao.order.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResultVo<T> {

    @JsonProperty("messageCode")
    private Integer code;

    @JsonProperty("messageText")
    private String message;

    @JsonProperty("dataList")
    private T data;

}
