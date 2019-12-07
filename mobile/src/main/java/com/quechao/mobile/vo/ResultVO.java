package com.quechao.mobile.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResultVO<T> {

    /**错误码*/
    private Integer code;

    /**提示信息*/
    private String message;

    /**list内容*/
    private T dataList;

}
