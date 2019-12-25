package com.quechao.order.dataobject;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * E店宝实体类，E店宝需要的
 */
@Data
public class EStore {

    /*
     * 订单编号
     */
    private String tid;
    /*
     * 外部平台单号
     */
    private String out_tid;
    /*
     * 店铺ID
     */
    private String shop_id;
    /*
     * 仓库编码
     * sdc 2017-01-23 系统升级 将Integer 类型改为 String类型
     */
    private String storage_id;
    /*
     * 买家ID
     */
    private String buyer_id;
    /*
     * 买家留言
     */
    private String buyer_msg;
    /*
     * 买家邮件地址
     */
    private String buyer_email;
    /*
     * 买家支付宝账号
     */
    private String buyer_alipay;
    /*
     * 客服备注
     */
    private String seller_remark;
    /*
     * 收货人姓名
     */
    private String consignee;
    /*
     * 收货地址
     */
    private String address;
    /*
     * 收货人邮编
     */
    private String postcode;
    /*
     * 联系电话
     */
    private String telephone;
    /*
     * 联系手机
     */
    private String mobilPhone;
    /*
     * 收货人省份
     */
    private String privince;
    /*
     * 收货人城市
     */
    private String city;
    /*
     * 收货人地区
     */
    private String area;
    /*
     * 实收运费
     */
    private Double actual_freight_get;
    /*
     * 实收参考价订单实收金额
     */
    private Double actual_RP;
    /*
     * 配送方式
     */
    private String ship_method;
    /*
     * 快递公司名
     */
    private String express;
    /*
     * 开票情况(是否已开发票0：无1：有)默认0
     */
    private int is_invoiceOpened;
    /*
     * 发票类型
     */
    private String invoice_type;
    /*
     * 开票金额
     */
    private String invoice_money;
    /*
     * 发票抬头
     */
    private String invoice_title;
    /*
     * 发票内容
     */
    private String invoice_msg;
    /*
     * 订单类型
     */
    private String order_type;
    /*
     * 处理状态
     */
    private String process_status;
    /*
     * 付款状态（待退款部分退款待退款全部退款待退款所有交易关闭未付款已付款已退款部分退款已退款全部退款已退款所有）默认：未付款
     */
    private String pay_status;
    /*
     * 发货状态（待退货部分退货待退货全部退货待退货所有退货到货部分退货退货到货全部退货退货到货所有未发货已发货）默认：未发货
     */
    private String deliver_status;
    /*
     * 是否货到付款
     */
    private Integer is_COD;
    /*
     * 货到付款服务费
     */
    private Double serverCost_COD;
    /*
     * 订单总金额
     */
    private Double order_totalMoney;
    /*
     * 产品总金额
     */
    private Double product_totalMoney;
    /*
     * 支付方式
     */
    private String pay_method;
    /*
     * 支付佣金
     */
    private Double pay_commission;
    /*
     * 支付积分
     */
    private Integer pay_score;
    /*
     * 返点积分
     */
    private Integer return_score;
    /*
     * 优惠金额:订单总优惠金额
     */
    private Double favorable_money;
    /*
     * 支付宝交易号
     */
    private String alipay_transaction_no;
    /*
     * 外部平台付款单号
     */
    private String out_payNo;
    /*
     * 外部平台快递方式
     */
    private String out_express_method;
    /*
     * 外部平台快递订单状态
     */
    private String out_order_status;
    /*
     * 订货日期
     */
    private Date order_date;
    /*
     * 付款日期
     */
    private String pay_date;
    /*
     * 完成日期
     */
    private Date finish_date;
    /*
     * 平台类型
     */
    private String plat_type;
    /*
     * 分销商编号
     */
    private String distributor_no;
    /*
     * 物流公司
     */
    private String WuLiu;
    /*
     * 物流单号
     */
    private String WuLiu_no;
    /*
     * 终端类型(电脑-手机-电话)
     */
    private String terminal_type;
    /*
     * 内部便签
     */
    private String in_memo;
    /*
     * 其他备注
     */
    private String other_remark;
    /*
     * 实付运费
     */
    private Double actual_freight_pay;
    /*
     * 预配货日期
     */
    private Date ship_date_plan;
    /*
     * 预计发货日期
     */
    private Date deliver_date_plan;
    /*
     * 是否积分换购（0：不是1：是）默认：0
     */
    private Integer is_scorePay;
    /*
     * 是否需要开发票（0：不需要1：需要）默认0
     */
    private Integer is_needInvoice;

    /**
     * 销售员标志 交易码
     * sdc 2010-01-12
     */
    private String salesPersonCode;

    // sdc 2017-01-16 是否使用免运费卷 0没有 1有
    private String isUseFreeExpress;

    // sdc 2017-01-16 是否使用货到付款 0没有 1有
    private String isUseCashDelivery;

    // sdc 2017-01-22 订单使用的现金券ID
    private Long CashCouponId;
    // sdc 2017-01-22 所使用的现金券金额
    private BigDecimal cashCouponMoney;
    // sdc 2017-01-10 增加会员注册地区
    // 注册 省
    private Integer rprovinceCh;
    // 注册 市
    private Integer rcityCh;
    // 注册 县区
    private Integer rcountyCh;
}
