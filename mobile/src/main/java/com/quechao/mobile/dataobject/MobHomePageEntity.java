package com.quechao.mobile.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 首页模版
 */
@Entity
@Data
@Table(name = "np_mob_home_page")
public class MobHomePageEntity {

    @Id
    private Long homepageId;

    private Long merchantId;//商家ID,boss为0

    private String doc;//移动版首页xml文档

    private String docBac;//移动版首页xml文档备份

    private Long updateUserId;//修改人ID号

    private Date updateDate;//更新时间

    private String temp1;//toke值

    private String temp2;//是否首页 0:否1:是

    private String temp3;//类型 0:页面1:模板

    private String temp4;//禁用状态 0:可用1:禁用

    private String title;//店铺标题

    private String logo;//店铺转发logo

    private String friendsDesc;//转发给朋友圈的内容

    private String friendDesc;//转发给朋友的内容

    private String homeDesc;//页面简介

    private String homeImg;//页面预览图片地址

    private String author;//作者

    private String isthird;//移动版识别标记 1：第三方商家 0：平台Boss

    private Long storeId;//第三方店铺ID

    private Long pageCateId;//页面分类id

    private Integer pageState;

    private Integer sort;

    private Date createDate;//创建时间

    private String jdoc;//移动版首页json数据

    private Integer isIndexPage;//是否是首页类型

    private String wareids;//首页对应的发货仓库主键列表


}
