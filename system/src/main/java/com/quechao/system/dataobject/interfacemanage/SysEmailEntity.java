package com.quechao.system.dataobject.interfacemanage;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "np_sys_email")
public class SysEmail {

    private Long serverid;//ID

    private String sendmail;//发信邮箱

    private String sendname;//发信人

    private String smtpaccount;//SMTP账号

    private String smtppass;//SMTP密码

    private String smtpserver;//SMTP服务器

    private String smtpport;//SMTP端口号

    private String isOpen;//是否开启(0未开启 1已开启)

    private String isCheck;//是否验证(0未验证 1已验证)

    private Date createTime;

    private Date modifyTime;//修改时间

    private String delFlag;
}
