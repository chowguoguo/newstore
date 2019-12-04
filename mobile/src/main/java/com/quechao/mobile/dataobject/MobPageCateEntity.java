package com.quechao.mobile.dataobject;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 页面分类信息
 */
@Entity
@Data
@Table(name = "np_mob_page_cate")
public class MobPageCate {

    @Id
    private Long cateId;

    private String name;

    private String remark;

    private String delflag;//删除标志

    private Long createUserId;//创建人ID

    private Date createDate;//创建日期

    private Long updateUserId;//修改人ID

    private Date updateDate;//更新日期



}
