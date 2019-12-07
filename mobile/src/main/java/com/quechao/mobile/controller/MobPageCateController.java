package com.quechao.mobile.controller;

import com.quechao.mobile.dataobject.MobPageCateEntity;
import com.quechao.mobile.service.MobPageCateService;
import com.quechao.mobile.utils.ResultVOUtil;
import com.quechao.mobile.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MobPageCateController {

    @Autowired
    private MobPageCateService mobPageCateService;

    //查询分类页面
    @RequestMapping("queryMobPageCateByPageBean")
    public ResultVO<MobPageCateEntity> queryMobPageCateByPageBean(
            @RequestParam(value = "page" ,defaultValue = "0")Integer page,
            @RequestParam(value = "size",defaultValue = "15")Integer size
    ){

        PageRequest request = PageRequest.of(page,size);
        Page<MobPageCateEntity> mobPageCateEntityPage
                = mobPageCateService.queryMobPageCateByPageBean(request);

        return ResultVOUtil.success(mobPageCateEntityPage.getContent());
    }

    //添加分类页面
    @RequestMapping("addMobPageCate")
    public ResultVO addMobPageCate(MobPageCateEntity mobPageCateEntity){
        try {
            mobPageCateService.addMobPageCate(mobPageCateEntity);
        }catch (Exception e){

        }
        return  ResultVOUtil.success();
    }

    /**
     *
     * @param ids 批量/单个删除
     * @return
     */
    @RequestMapping("delMobPageCate")
    public ResultVO delMobPageCate(Long ids){
        try {
            mobPageCateService.delMobPageCate(ids);
        }catch (Exception e){
            System.out.println(e);
        }

        return  ResultVOUtil.success();

    }



}
