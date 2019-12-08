package com.quechao.mobile.service.impl;

import com.quechao.mobile.dataobject.MobPageCateEntity;
import com.quechao.mobile.repository.MobPageCateRepository;
import com.quechao.mobile.service.MobPageCateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MobPageCateServiceImpl implements MobPageCateService {

    @Autowired
    private MobPageCateRepository mobPageCateRepository;


    @Override
    public Page<MobPageCateEntity> queryMobPageCateByPageBean(Pageable pageable) {

        return mobPageCateRepository.findByDelflag("0", pageable);
    }

    /**
     * 添加
     *
     * @param mobPageCateEntity
     */
    @Override
    public void addMobPageCate(MobPageCateEntity mobPageCateEntity) {

        mobPageCateRepository.save(mobPageCateEntity);

    }

    @Override
    public void delMobPageCate(Long ids) {
        //先查询出该分类页面信息
        MobPageCateEntity mobPageCateEntity =
                mobPageCateRepository.findById(ids).get();

        //设置delflag
        mobPageCateEntity.setDelflag("1");

        //保存
        mobPageCateRepository.save(mobPageCateEntity);
    }
}
