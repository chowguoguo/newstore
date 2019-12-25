package com.quechao.order.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderGoodsListVo {

    private String goodsInfoName;//

    private Long goodsInfoNum;//

    private BigDecimal goodsInfoPrice;

    private BigDecimal goodsInfoSumPrice;
}
