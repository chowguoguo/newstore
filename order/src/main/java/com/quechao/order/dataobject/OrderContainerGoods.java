package com.quechao.order.dataobject;

import com.quechao.order.enums.OrderEnum;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "np_order_container")
//商品的装箱信息
public class OrderContainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long containerId;

    private Long goodsInfoId;

    private Long goodsNum;

    private String containerStatus = OrderEnum.ORDERCONTAINERS.GOODS.ordinal()+"";

    @OneToMany(mappedBy = "orderContainer",cascade = CascadeType.PERSIST)
    private Set<OrderContainerGoods> containerDetail;
}
