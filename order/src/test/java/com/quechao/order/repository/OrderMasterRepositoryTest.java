package com.quechao.order.repository;

import com.quechao.order.dataobject.OrderMaster;
import com.quechao.order.enums.OrderStatusEnum;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.util.calendar.BaseCalendar;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;
    private final String OPENID="110110";

    @Test
    void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setBuyerName("chowguoguo");
        orderMaster.setBuyerAddress("北京市房山区");
        orderMaster.setBuyerPhone("185110035869");
        orderMaster.setOrderAmount(new BigDecimal(2.21));
        orderMaster.setOrderId("JAd9977");

        OrderMaster result = repository.save(orderMaster);
        assertNotNull(result);
    }


    @Test
    void findByBuyerOpenid() {
    }
}