package com.quechao.goods.controller;

import com.quechao.goods.dataobject.GoodsCategoryEntity;
import com.quechao.goods.service.AddGoodsService;
import com.quechao.goods.util.ResultUtil;
import com.quechao.goods.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddGoodsController {

    @Autowired
    private AddGoodsService addGoodsService;

    @RequestMapping("querySonCateByCatIdAndName")
    public ResultVo querySonCateByCatIdAndName(Long catId){

        List<GoodsCategoryEntity>goodsCategoryList = addGoodsService.querySonCateByCatIdAndName(catId);
        return ResultUtil.success(goodsCategoryList);

    }
}
