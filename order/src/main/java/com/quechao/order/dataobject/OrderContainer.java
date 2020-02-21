package com.quechao.order.dataobject;

import com.quechao.order.enums.CommonEnums;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "np_order_container_relation")
@EqualsAndHashCode(exclude = {"orderMaster"})
public class OrderContainerGoods {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long relationId;//装箱单id

    //private Long orderId;//订单id

    private String delFlag = CommonEnums.DelFlag.NORMAL.ordinal()+"";//删除标记

    private String expressNo;//物流单号

    private Long orderExpressId;//物流单id

    private String expressName;//

    private BigDecimal expressPrice;//运费

    private BigDecimal goodsPrice;//商品金额

    private Integer expressWeight;//物品重量

    private Date addTime;//导入运单price的时间戳

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderMasterEntity orderMaster;

    @ManyToOne
    @JoinColumn(name = "relation_id")
    private OrderContainer orderContainer;
}
