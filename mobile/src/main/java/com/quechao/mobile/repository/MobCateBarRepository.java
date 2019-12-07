package com.quechao.mobile.repository;

import com.quechao.mobile.dataobject.MobCateBarEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 导航分类
 * 表名：np_mob_cate_bar
 */
public interface MobCateBarRepository extends JpaRepository<MobCateBarEntity,Long> {

    Page<MobCateBarEntity> findByDelflag(String delflag, Pageable pageable);
}
