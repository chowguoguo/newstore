package com.quechao.mobile.repository;

import com.quechao.mobile.dataobject.MobPageCateEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MobPageCateRepository extends JpaRepository<MobPageCateEntity,Long> {

    Page<MobPageCateEntity> findByDelflag(String delflag, Pageable pageable);

}
