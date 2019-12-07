package com.quechao.mobile.service;


import com.quechao.mobile.dataobject.MobCateBarEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MobCateBarService {

    //查询分类导航列表
    Page<MobCateBarEntity> queryMobCateBarByPb(String delflag,Pageable pageable);

    //添加、修改分类导航
    MobCateBarEntity createMobCateBar(MobCateBarEntity mobCateBarEntity);

    //删除分类导航
    void deleteMobCateBar (Long mobCateBarId);
}
