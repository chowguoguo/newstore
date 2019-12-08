package com.quechao.mobile.service;


import com.quechao.mobile.dataobject.MobPageCateEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MobPageCateService {


    //查询列表
    Page<MobPageCateEntity> queryMobPageCateByPageBean(Pageable pageable);

    //删除某个分类
    void delMobPageCate(Long ids);

    //添加分类
    void addMobPageCate(MobPageCateEntity mobPageCateEntity);

}
