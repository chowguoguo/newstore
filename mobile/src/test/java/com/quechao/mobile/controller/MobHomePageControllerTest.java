package com.quechao.mobile.controller;

import com.quechao.mobile.utils.FreeMaker2StaticHtmlUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MobHomePageControllerTest {

    @Autowired
    private FreeMaker2StaticHtmlUtil freeMaker2StaticHtmlUtil;

    @Test
    public void testHtml() throws Exception {

        String sourceFile = "mobileTemplate.ftl";
        File desPath = new File("E://test.html");
        Map<String, Object> contentMap = new HashMap<>();

        //css
        List<String> cssList = new ArrayList<>();
        cssList.add("http://www.qcmeibohui.com/mobile_home_page/css/bootstrap.min.css");
        cssList.add("http://www.qcmeibohui.com/mobile_home_page/css/style.css\n");
        cssList.add("http://www.qcmeibohui.com/css/bootstrap.min.css");
        cssList.add("http://www.qcmeibohui.com/css/idangerous.swiper.css");
        cssList.add("http://www.qcmeibohui.com/css/style.css");
        cssList.add("http://www.qcmeibohui.com/css/style.min.css");
        cssList.add("http://www.qcmeibohui.com/css/ui-dialog.css");
        //js
        List<String> jsList = new ArrayList<>();
        jsList.add("http://www.qcmeibohui.com/js/jquery-1.10.1.js");
        jsList.add("http://www.qcmeibohui.com/js/idangerous.swiper.js");
        jsList.add("http://www.qcmeibohui.com/js/dialog-min.js");
        jsList.add("http://www.qcmeibohui.com/js/jquery.min.js");
        jsList.add("http://www.qcmeibohui.com/js/jquery.slides.min.js");
        jsList.add("http://www.qcmeibohui.com/js/jcarousellite_1.0.1.js");
        jsList.add("http://www.qcmeibohui.com/js/tabScript.js");
        jsList.add("http://www.qcmeibohui.com/js/dialog.min.js");
        jsList.add("http://www.qcmeibohui.com/js/bootstrap.min.js");
        jsList.add("http://www.qcmeibohui.com/js/fastclick.min.js");
        jsList.add("http://www.qcmeibohui.com/js/idangerous.swiper-2.1.min.js");
        jsList.add("http://www.qcmeibohui.com/js/jquery.keleyi.js");
        jsList.add("http://www.qcmeibohui.com/js/jquery.lazyload.js");
        jsList.add("http://www.qcmeibohui.com/js/customer/wxforward.js");
        jsList.add("http://www.qcmeibohui.com/js/flushMenu.js");
        jsList.add("http://www.qcmeibohui.com/js/touchmove.js");
        jsList.add("http://s11.cnzz.com/z_stat.php?id=1261447861&web_id=1261447861");
        jsList.add("http://c.cnzz.com/core.php?web_id=1261447861&t=z");
        contentMap.put("cssList", cssList);
        contentMap.put("jsList", jsList);

        String context = "";
        freeMaker2StaticHtmlUtil.makeHtml(contentMap, sourceFile, desPath);

    }


}