package com.quechao.system.service.systemManage;

import com.quechao.system.dataobject.systemManage.SysBasicEntity;
import com.quechao.system.dataobject.systemManage.SysBasicsetEntity;
import com.quechao.system.dataobject.systemManage.SysUploadfileset;

public interface SystemManageService {

    //basicset,查询基本信息页面
    public SysBasicsetEntity queryBasicSet();

    public SysBasicEntity queryBasic();

    public SysUploadfileset queryUploadfileset();


}
