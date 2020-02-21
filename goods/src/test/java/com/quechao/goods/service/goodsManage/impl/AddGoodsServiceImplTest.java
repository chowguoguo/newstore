package com.quechao.goods.service.impl;

import com.quechao.goods.service.AddGoodsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public  class AddGoodsServiceImplTest {

    @Autowired
    private AddGoodsService goodsService;

    @Test
   public void querySonCateByCatIdAndNameTest(){

        goodsService.querySonCateByCatIdAndName(0L);

    }

}