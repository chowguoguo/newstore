package com.quechao.order.service.impl;

import com.quechao.order.dataobject.OrderMasterEntity;
import com.quechao.order.dto.OrderDTO;
import com.quechao.order.form.SearchOrderForm;
import com.quechao.order.repository.OrderRepository;
import com.quechao.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository repository;

    @Override
    public Page<OrderMasterEntity> orderList(SearchOrderForm searchOrderForm, Pageable pageable) {

        List<Predicate> list = new ArrayList<>();

        Specification<OrderMasterEntity> specification = new Specification<OrderMasterEntity>() {
            @Override
            public Predicate toPredicate(Root<OrderMasterEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                //orderCode
                if (!StringUtils.isEmpty(searchOrderForm.getOrderCode())){
                    Predicate orderCode =
                            criteriaBuilder.equal(root.get("orderCode"),searchOrderForm.getOrderCode());
                    list.add(orderCode);
                }
//                //shippingPerson，收货人
                if (!StringUtils.isEmpty(searchOrderForm.getShippingPerson())){
                    Predicate shipppingPresong = criteriaBuilder.equal(root.get("person"),searchOrderForm.getShippingPerson());
                    list.add(shipppingPresong);
                }
//                //shippingMobile收货人电话
                if (!StringUtils.isEmpty(searchOrderForm.getShippingMobile())){
                    Predicate shippingMobile = criteriaBuilder.equal(root.get("mobile"),searchOrderForm.getShippingMobile());
                    list.add(shippingMobile);
                }

                //customerUsername用户名
                if (!StringUtils.isEmpty(searchOrderForm.getCustomerUsername())){
                    //查询用户名所属的用户ID号,Customer服务进行查询
                    //TODO
                    Long[] customerIds = {27256L,22892L};
                    CriteriaBuilder.In<Object> customerId = criteriaBuilder.in(root.get("customerId").in(customerIds));
                    //Predicate shippingMobile = criteriaBuilder.equal(root.get("mobile"),searchOrderForm.getShippingMobile());
                    list.add(criteriaBuilder.and(customerId));
                }
                //expressNo 运单号
                if (!StringUtils.isEmpty(searchOrderForm.getExpressNo())){
                    Predicate shippingMobile = criteriaBuilder.equal(root.get("mobile"),searchOrderForm.getShippingMobile());
                    list.add(shippingMobile);
                }

//                //startTime
//                if (searchOrderForm.getStartTime()!=null && searchOrderForm.getEndTime()!=null){
//                    Predicate startTime = criteriaBuilder.between(root.get("createTime"),searchOrderForm.getStartTime()
//                            ,searchOrderForm.getEndTime());
//                }

                Predicate[] p = list.toArray(new Predicate[list.size()]);

                return criteriaBuilder.and(p);
            }
        };

        Page<OrderMasterEntity> orderList = repository.findAll(specification, pageable);

        return orderList;


    }

    @Override
    public String sentOrderToEdb(String orderId) {
        return null;
    }
}
