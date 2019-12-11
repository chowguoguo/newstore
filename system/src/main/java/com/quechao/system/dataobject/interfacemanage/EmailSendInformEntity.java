package com.quechao.system.dataobject.interfacemanage;

import lombok.Data;
import lombok.Generated;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "np_sendinform")
@DynamicUpdate
public class EmailSendInform {

    @Id
    @Generated
    private Long id;//自增长id

    private String text;//内容

    private Data updatetime;

}
