package com.quechao.mobile.repository;


import com.quechao.mobile.dataobject.MobHomePage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MobHomePageRepository extends JpaRepository<MobHomePage,Long>, JpaSpecificationExecutor<MobHomePage> {
}
