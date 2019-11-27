package com.quechao.mobile.controller;

import com.quechao.mobile.dto.CatePageDTO;
import com.quechao.mobile.vo.ResultVO;
import com.quechao.mobile.vo.templatepage.PageCateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 页面分类
 */
@RestController
@Slf4j
public class CatePageController {

    @RequestMapping("queryMobPageCateByPageBean")
    public ResultVO<List<CatePageDTO>> queryMobPageCateByPageBean(){


        return null;

    }
}
