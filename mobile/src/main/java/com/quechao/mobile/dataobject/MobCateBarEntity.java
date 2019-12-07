package com.quechao.mobile.dataobject;

import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "np_mob_cate_bar")
public class MobCateBarEntity {

    @Id
    @Generated
    private Long cateBarId;

    private Long cateId;

    private String name;

    private String imgSrc;

    private Integer grade = 1;

    private Integer sort;

    private Long parentId = 0L;

    private String isUsing;

    private String delflag ="0";

    private Long createUserId;

    private Date createDate;

    private Long updateUserId;

    private Date updateDate;

    private String temp1;

    private String temp2;

    private String temp3;

    private String temp4;

    private String temp5;


}
