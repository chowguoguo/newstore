package com.quechao.mobile.controller;
import com.quechao.mobile.dataobject.MobCateBarEntity;
import com.quechao.mobile.service.MobCateBarService;
import com.quechao.mobile.utils.ResultVOUtil;
import com.quechao.mobile.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//移动版-站点设置-分类导航
@RestController
public class MobCateBarController {

    @Autowired
    private MobCateBarService mobCateBarService;

    //查询分类导航
    //
    @RequestMapping("/queryMobCateBarByPb")
    public ResultVO<List<MobCateBarEntity>> queryMobCateBarByPb(
            @RequestParam(value = "page" ,defaultValue = "0" ) Integer page,
            @RequestParam(value = "size",defaultValue = "15") Integer size
    ){
        PageRequest request = PageRequest.of(page,size);
        Page<MobCateBarEntity> mobCateBarEntityPage = mobCateBarService.queryMobCateBarByPb("0",request);

        return ResultVOUtil.success(mobCateBarEntityPage.getContent());
    }


    //添加、修改分类导航
    @RequestMapping("createMobCateBar")
    public ResultVO createMobCateBar(MobCateBarEntity mobCateBarEntity){

        MobCateBarEntity mobCateBar = mobCateBarService.createMobCateBar(mobCateBarEntity);

        return  null;
    }

    //删除导航
    @RequestMapping("/deleteMobCateBar")
    public ResultVO deleteMobCateBar(Long mobCateBarId){

        mobCateBarService.deleteMobCateBar(mobCateBarId);
         return ResultVOUtil.success();

    }
}
