package com.quechao.mobile.controller;

import com.quechao.mobile.dataobject.MobHomePage;
import com.quechao.mobile.dto.CatePageDTO;
import com.quechao.mobile.service.MobHomePageService;
import com.quechao.mobile.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class MobHomePageController {

    @Autowired
    private MobHomePageService homePageService;

    @RequestMapping("queryMobPageList")
    public ResultVO<List<MobHomePage>> queryMobPageList(){

        List<MobHomePage> mobHomePageList = homePageService.findAll();

        System.out.println(mobHomePageList);

        return  null;

    }
}
