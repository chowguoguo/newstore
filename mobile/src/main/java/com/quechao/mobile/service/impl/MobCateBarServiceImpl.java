package com.quechao.mobile.service.impl;

import com.quechao.mobile.dataobject.MobCateBarEntity;
import com.quechao.mobile.repository.MobCateBarRepository;
import com.quechao.mobile.service.MobCateBarService;
import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class MobCateBarServiceImpl implements MobCateBarService {

    @Autowired
    private MobCateBarRepository mobCateBarRepository;

    //查询分类导航
    @Override
    public Page<MobCateBarEntity> queryMobCateBarByPb(String delflag, Pageable pageable) {

        Page<MobCateBarEntity> mobCateBarEntityPage = mobCateBarRepository.findByDelflag("0", pageable);

        return mobCateBarEntityPage;
    }

    //创建分类导航
    @Override
    public void createMobCateBar(MobCateBarEntity mobCateBarEntity) {
        //mysql 5.7以上，不需要设置时间，默认会自动更新
        if (mobCateBarEntity.getCateBarId() == 0) {
            mobCateBarEntity.setCreateDate(new Date());
            mobCateBarEntity.setUpdateDate(new Date());
        } else {
            mobCateBarEntity.setUpdateDate(new Date());
        }
        //TODO 添加修改人
        mobCateBarRepository.save(mobCateBarEntity);
    }

    //删除分类导航
    @Override
    public void deleteMobCateBar(Long mobCateBarId) {

        //1、先找出这个分类
        Optional<MobCateBarEntity> mobCateBarEntityOptional = mobCateBarRepository.findById(mobCateBarId);

        MobCateBarEntity mobCateBarEntity = mobCateBarEntityOptional.get();
        //修改delflag=1；
        mobCateBarEntity.setDelflag("1");
        //update表
        mobCateBarRepository.save(mobCateBarEntity);

    }
}
