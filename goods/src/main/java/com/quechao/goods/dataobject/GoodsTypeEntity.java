package com.quechao.goods.dataobject.goodsConfig;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "np_goods_type")
public class GoodsTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long typeId;//主键ID

    private String typeName;//类型名称

    private String typeNickname;//类型别名

    private String typeIsreal;//实体商品

    private String typeImg;//类型图片

    private String typeContactBrand;//关联品牌

    private String typeGoodsExpand;//商品扩展属性

    private String typeGoodsParamer;//商品参数表

    private String typeDelflag;//是否删除

    private String typeCreateName;//创建人名称

    private Date typeCreateTime;//创建时间

    private String typeModifiedName;//修改人名称

    private Date typeModifyedTime;//修改时间

    private String typeDelName;//删除人名称

    private Date typeDelTime;//删除时间

}
