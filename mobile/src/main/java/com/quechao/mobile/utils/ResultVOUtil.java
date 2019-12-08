package com.quechao.mobile.utils;

import com.quechao.mobile.vo.ResultVO;

public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setDataList(object);
        resultVO.setCode(0);
        resultVO.setMessage("请求成功");
        return resultVO;
    }

    public static ResultVO success() {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMessage("请求成功");
        return resultVO;
    }

    public static ResultVO error(Integer code, String message) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(1);
        resultVO.setMessage(message);
        return resultVO;
    }

}
