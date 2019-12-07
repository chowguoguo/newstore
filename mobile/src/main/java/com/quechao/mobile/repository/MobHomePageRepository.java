package com.quechao.mobile.repository;


import com.quechao.mobile.dataobject.MobHomePageEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 首页模版
 */

//模版列表
//模版的新建或修改保存
public interface MobHomePageRepository extends JpaRepository<MobHomePageEntity,Long>, JpaSpecificationExecutor<MobHomePageEntity> {

    Page<MobHomePageEntity> findByTemp3AndTemp4(String temp3, String temp4, Pageable pageable);
}
