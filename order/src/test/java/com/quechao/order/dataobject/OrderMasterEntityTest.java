package com.quechao.order.dataobject;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "np_order")
@EqualsAndHashCode(exclude = {"orderLogs","orderExpress","orderGoods"})
public  class OrderMasterEntityTest {


    @Id
    @GeneratedValue
    private Long orderId;//订单Id

    private String orderCode;//订单编号

    @Column(columnDefinition = "decimal(19,2) check(orderPrice>0)")//mysql不支持check约束
    private BigDecimal orderPrice;//order_price

    private BigDecimal orderPrePrice;//order_pre_price

    private BigDecimal ordeOldPrice;//订单原始总金额

    private String orderStatus;//订单状态 0未付款 1已付款未发货 2已发货 3已经收货 4作废 7:申请退货 8：同意退货 9:拒绝退货 10:确认收货 11:订单结束 12:同意退款13： 拒绝退款 14:已提交退货审核 15：已提交退款审核 16: 收货失败 17:已退款 18:申请退款 退款成功

    private Long customerId;//会员ID

    private Date payTime;//支付时间

    private Date sendExpressTime;//发货时间

    private Date getGoodsTime;//收货时间

    @Column(name = "shopping_addr_id")
    private Long AddressId;//收货地址ID

    @Column(name = "shipping_province")
    private String Province;//收货省

    @Column(name = "shipping_city")
    private String city;//收货市

    @Column(name = "shipping_county")
    private String county;//收货区县

    @Column(name = "shipping_address")
    private String address;//收货详细地址

    @Column(name = "shipping_person")
    private String person;//收货人

    @Column(name = "shipping_phone")
    private String phone;//收货电话

    @Column(name = "shipping_mobile")
    private String mobile;//收货手机

    @Column(name = "shipping_postcode")
    private String postcode;//邮编

    private String invoiceTitle;//发票抬头

    private String invoiceContent;//发票内容

    private String delFlag;//删除标记

    private String invoiceType;//发票类型

    private String customerRemark;//客户留言

    private Long payId;//支付方式

    private Long orderIntegral;//积分

    private String couponNo;//使用的优惠券

    private String evaluateFlag;//是否评价 0未评价 1已经评价

    private BigDecimal expressPrice;//运费

    private Date orderCancelTime;//取消时间

    private String orderCancelRemark;//原因

    private BigDecimal backPrice;//退单金额

    private Long businessId;//商家ID

    private String dealerType;//第三方 0  经销商1

    private Date createTime;//创建时间

    private String orderOldCode;//主单编号

    private String orderNewStatus;//是否是新增订单 0 新增订单 1 已查看订单

    private String orderCargoStatus;

    private String orderMType;

    private String orderExpressType;//

    private BigDecimal orderPrePriceOrder;//订单促销优惠

    private String orderLinePay;//1在线支付 0货到付款

    @Column(name = "shipping_county_id")
    private Integer countyId;//区id

    private Long wareId;//仓库id

    private String wareName;//仓库名

    private String sendPerson;//送货人

    private String sendMobile;//送货人电话

    private String directType;//0 商家订单 1直营店订单

    private BigDecimal jfPrice;//积分兑换金额

    private BigDecimal modifyPrice;//订单修改金额

    private Long orderGetPoint;//订单消费获得积分

    private BigDecimal promotionsPrice;//促销金额

    private String finishSturts;//判断该订单曾经是否是以完成订单 1：是

    private BigDecimal discountPrice;//会员折扣金额

    private BigDecimal couponPrice;//优惠券金额

    private String salesperconCode;//销售员标记,交易码

    private Long rprovincech;

    private Long rcitych;

    private Long rcountych;

    private String isUseFreeExpress;//是否使用免运费卷

    private String isUseCashDelivery;//是否使用货到付款

    private String cashCouponIds;//使用现金券IDs

    private BigDecimal cashCouponMoney;//现金券金额

    private String autoReceive;//是否是自动收货 0否 1是

    private Date autoReceiveTime;//自动收货时间

    private String managerRemark;//客服备注

    private Long grouponId;//团购促销ID

    private Date grouponCanPayTime;//团购订单可以支付时间

    private BigDecimal depositDeductionPrice;//预存款抵扣金额

    private String autoReceiveInterval;//自动收货时间间隔 1:10天 2:30天

    private String pointOrder;//积分兑换订单 0否 1是

    @OneToMany(mappedBy = "orderMaster" ,cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    private Set<OrderLogEntity> orderLogs = new HashSet<>();

    @OneToMany(mappedBy = "orderMaster",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    private Set<OrderContainer> orderExpress = new HashSet<>();

    @OneToMany(mappedBy = "orderMaster",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    private Set<OrderGoodsEntity> orderGoods = new HashSet<>();


}