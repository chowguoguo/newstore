package com.quechao.mobile.form;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
//添加分类导航
@Data
public class MobNavigationAddForm {

    private Long cateBarId;//分类导航ID，如果为null，则为新建，否则为修改

    private Long cateId;//这是商品分类的Id

    @NotNull
    @Pattern(regexp = "[^''\\\\[\\\\]\\\\<\\\\>?\\\\\\\\!]+")
    private String name;//分类名称

    private Integer sort;//排序

    private Integer isUsing;//是否

    private  Integer grade;//级别,共分3级

    private Integer parendId;//上一级id

    private String migSrc;//图片url，用于三级时候才有


}
