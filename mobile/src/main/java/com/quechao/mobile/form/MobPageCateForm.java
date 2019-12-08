package com.quechao.mobile.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class MobPageCateForm {

    private Integer pageCateId;//

    @NotEmpty(message = "分类名称不能为空")
    @NotNull(message = "分类名称不能为空")
    private String name;//分类名称

    private String remark;
}
