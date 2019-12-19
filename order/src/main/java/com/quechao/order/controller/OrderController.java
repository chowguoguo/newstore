package com.quechao.order.controller;

import com.quechao.order.dto.OrderDTO;
import com.quechao.order.form.SearchOrderForm;
import com.quechao.order.service.OrderService;
import com.quechao.order.util.ResultUtil;
import com.quechao.order.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class OrderController {

    @Autowired
    private OrderService orderService;

    //订单列表
    @RequestMapping("orderlist")
    public ResultVo orderlist(SearchOrderForm searchOrderForm, @RequestParam(value = "page",defaultValue = "1") Integer page,
                              @RequestParam(value = "size",defaultValue = "15") Integer size){
        PageRequest request = PageRequest.of(page,size);

        Page<OrderDTO> orderList = orderService.orderList(searchOrderForm, request);

        return ResultUtil.success(orderList);

    }

    //推送E店宝
    @RequestMapping("sentOrderToEdb")
    public ResultVo sentOrderToEdb(String orderId){

        return  null;
    }

    //更新E店宝状态
    @RequestMapping("getorderstatus")
    public ResultVo getorderstatus(String orderId){

        return  null;
    }

    //导出订单
    @RequestMapping("exportAllOrder")
    public ResultVo exportAllOrder(String orderId){

        return null;
    }









}
