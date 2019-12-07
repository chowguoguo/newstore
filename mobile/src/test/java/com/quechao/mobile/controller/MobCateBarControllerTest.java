package com.quechao.mobile.controller;

import com.quechao.mobile.dataobject.MobCateBarEntity;
import com.quechao.mobile.service.MobCateBarService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class )
@SpringBootTest
@Slf4j
class MobCateBarControllerTest {

    @Autowired
    private MobCateBarService mobCateBarService;

    @Test
    void queryMobCateBarByPb() {

        Integer page =0;
        Integer size=15;

        PageRequest request = PageRequest.of(page,size);
        Page<MobCateBarEntity> mobCateBarEntityPage = mobCateBarService.queryMobCateBarByPb("0",request);
        System.out.println(mobCateBarEntityPage);
    }

    @Test
    void  deleteMobCateBar(){
        Long catebarId = 961L;

        mobCateBarService.deleteMobCateBar(catebarId);
    }
}