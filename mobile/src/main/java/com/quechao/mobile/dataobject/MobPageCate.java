package com.quechao.mobile.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "np_mob_page_cate")
public class MobPageCate {

    @Id
    private Long pageCateId;

    private String name;

    private String remark;

    private Integer delflag;

    private Long createUserId;

    private Date createDate;

    private Long updateUserId;

    private Date updateDate;

}
