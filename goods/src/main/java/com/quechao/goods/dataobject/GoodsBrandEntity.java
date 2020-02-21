package com.quechao.goods.dataobject;

import lombok.Data;

import javax.persistence.*;
import java.io.PipedReader;
import java.util.Date;

@Entity
@Table(name = "np_goods_brand")
@Data
public class GoodsBrand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long brandId;//

    private String brandNickname;//品牌别名

    private String brandName;//品牌名称

    private String brandUrl;//品牌网址

    private String brandLogo;//品牌LOGO

    private String brandPromIndex;//推荐到首页

    private Integer brandSort;//排序

    private String brandSeoTitle;//SEO title

    private String brandSeoKeyword;//SEO keyword

    private String brandSeoDesc;//SEO Desc

    private String brandDesc;//品牌介绍

    private String brandDelflag;//创建人名称

    private String brandCreateName;//创建时间

    private Date brandCreateTime = new Date();//

    private String brandModifiedName;//修改人名称

    private Date brandModifiedTime;//修改时间

    private String brandDelName;//删除人名称

    private Date brandDelTime;//删除时间

    private Long storeId;//商家id

    private String hasRestrict;//enum,是否购买限制 0不限制 1有限制
}
