package com.quechao.order.repository;

import com.quechao.order.dataobject.OrderMasterEntity;

import com.quechao.order.dataobject.OrderMasterEntityTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface orderMasterRepository extends JpaRepository<OrderMasterEntityTest,Long>, JpaSpecificationExecutor<OrderMasterEntity> {

}
