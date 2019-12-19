package com.quechao.order.service;

import com.quechao.order.dataobject.*;
import com.quechao.order.repository.AuthorRepository;
import com.quechao.order.repository.OrderRepository;
import com.quechao.order.repository.RolesRepositroy;
import com.quechao.order.repository.UserRepositroy;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class OrderServiceTest {

    @Autowired
    private AuthorRepository repository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepositroy userRepositroy;

    @Autowired
    private RolesRepositroy rolesRepositroy;

    @Test
    void testSave(){
        AuthorEntity authorEntity = new AuthorEntity();

        authorEntity.setAuthName("cc");
        AuthorEntity save = repository.save(authorEntity);
        System.out.println(save);
    }

    @Test
    void testQuery(){
        Optional<AuthorEntity> result = repository.findById(1L);
        List<ArticleEntity> articleList = result.get().getArticleList();
        System.out.println(articleList);
    }

    @Test
    void testCreate(){
        //repository.
        OrderMaster order = new OrderMaster();
       // order.setOrderId(558L);
        order.setOrderCode("0001");
        order.setOrderPrice(new BigDecimal(23.9));

        OrderDetail orderDetail1 = new OrderDetail();
        orderDetail1.setItemId(1L);
        orderDetail1.setItemPrice(new BigDecimal(10));
        orderDetail1.setOrder(order);

        OrderDetail orderDetail2 = new OrderDetail();
        orderDetail2.setItemId(2L);
        orderDetail2.setItemPrice(new BigDecimal(20L));
        orderDetail2.setOrder(order);

       order.getOrderDetails().add(orderDetail1);
       order.getOrderDetails().add(orderDetail2);



        System.out.println(order);
        orderRepository.save(order);

    }

    @Test
    void testUser(){

        Users user1 = new Users();
        user1.setAddress("天津");
        user1.setAge(32);
        user1.setName("小刚");

        Users user2 = new Users();
        user2.setAddress("上海");
        user2.setAge(22);
        user2.setName("小陈");

        Roles roles = new Roles();
        roles.setRoleName("管理员");

        roles.getUsers().add(user1);
        roles.getUsers().add(user2);

        user1.setRoles(roles);
        user2.setRoles(roles);

        userRepositroy.save(user1);
    }

    @Test
    void testRoles(){

        Roles roles = new Roles();
        roles.setRoleName("管理员2");

        Users users1 = new Users();
        users1.setName("周果果");
        users1.setAge(20);
        users1.setAddress("天安门");

        Users users2 = new Users();
        users2.setName("陈二傻");
        users2.setAge(41);
        users2.setAddress("石楼镇");

    }

}