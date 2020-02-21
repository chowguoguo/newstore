package com.quechao.goods.service;

import com.quechao.goods.dataobject.goodsConfig.GoodsCategoryEntity;

import java.util.List;

public interface AddGoodsService {

    List<GoodsCategoryEntity> querySonCateByCatIdAndName(Long catId);
}
