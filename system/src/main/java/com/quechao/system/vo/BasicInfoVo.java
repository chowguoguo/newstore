package com.quechao.system.vo;

import com.quechao.system.dataobject.systemManage.SysBasicEntity;
import com.quechao.system.dataobject.systemManage.SysBasicsetEntity;
import com.quechao.system.dataobject.systemManage.SysUploadfileset;
import lombok.Data;

@Data
public class SystemManageVo {

    private SysBasicsetEntity parameter;

    private SysBasicEntity sysBasic;

    private SysUploadfileset ufs;
}
