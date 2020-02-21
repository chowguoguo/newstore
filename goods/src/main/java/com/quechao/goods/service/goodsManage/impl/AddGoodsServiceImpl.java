package com.quechao.goods.service.impl;

import com.quechao.goods.dataobject.goodsConfig.GoodsCategoryEntity;
import com.quechao.goods.repository.GoodsCateRepository;
import com.quechao.goods.service.AddGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddGoodsServiceImpl implements AddGoodsService {

    @Autowired
    private GoodsCateRepository goodsCateRepository;

    @Override
    public List<GoodsCategoryEntity> querySonCateByCatIdAndName(Long catId) {

        List<GoodsCategoryEntity> categoryList = goodsCateRepository.findByCatParentIdAndCatDelflagOrderByCatSortDesc(catId,"0");

        return categoryList;
    }
}
