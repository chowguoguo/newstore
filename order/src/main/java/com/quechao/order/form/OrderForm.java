package com.quechao.order.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data//form 类型接收来自前端的数据类型，form验证也在这个类
public class OrderForm {

    @NotEmpty(message = "下单人姓名不能为空")
    private String name;

    @NotEmpty(message = "下单人电话不能为空")
    private String phone;

    @NotEmpty(message = "下单人地址不能为空")
    private String address;

//    @NotEmpty(message = "购物车不能为空")
    private String items;


}
