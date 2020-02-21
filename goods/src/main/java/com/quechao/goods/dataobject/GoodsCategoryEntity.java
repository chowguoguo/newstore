package com.quechao.goods.dataobject.goodsConfig;

import com.quechao.goods.enums.GoodsCommonEnum;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "np_goods_category")
public class GoodsCategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long catId;//分类id

    private String catName;//分类名称

    private Long catParentId;//父级分类id

    private Long typeId;//商品类型

    private Integer catSort;//排序

    private Integer catGrade;//层级数

    private String catSeoTitle;//SEO title

    private String catSeoKeyword;//SEO keyword

    private String catSeoDesc;//SEO Desc

    private String catIsShow = GoodsCommonEnum.ShowFlag.DISPLAY.ordinal()+"";//是否显示

    private String catDelflag = GoodsCommonEnum.DelFlag.NORMAL.ordinal()+"";//是否删除

    private String catCreateName;//创建人名称

    private Date catCreateTime = new Date();//创建时间

    private String catModifiedName;//修改人名称

    private Date catModifiedTime;//修改时间

    private String catDelName;//删除人名称

    private Date catDelTime;//删除时间

    private BigDecimal catRate;//类目扣率

    private String catModel;//
}
