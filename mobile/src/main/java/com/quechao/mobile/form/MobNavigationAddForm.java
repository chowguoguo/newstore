package com.quechao.mobile.form;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class MobNavigationForm {

    private Long cateBarId;//分类导航ID，如果为null，则为新建，否则为修改

    private Long cateId;//所选择的分类ID

    @NotNull
    @Pattern(regexp = "[^''\\\\[\\\\]\\\\<\\\\>?\\\\\\\\!]+")
    private String name;//分类名称

    private Integer sort;//排序

    private Integer isUsing;//是否启用


}
