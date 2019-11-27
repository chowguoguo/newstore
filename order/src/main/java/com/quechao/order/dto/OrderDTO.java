package com.quechao.order.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.quechao.order.dataobject.OrderMaster;
import com.quechao.order.enums.OrderStatusEnum;
import com.quechao.order.util.EnumUtil;
import lombok.Data;

import java.util.Date;

@Data
public class OrderDTO {

    private Integer orderStatusCode;

    private Date createTime;

    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum(){
        return EnumUtil.getByCode(orderStatusCode,OrderStatusEnum.class);
    }
}
