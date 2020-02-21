package com.quechao.goods.dataobject;

import lombok.Data;

import javax.persistence.*;
import java.io.PipedReader;
import java.util.Date;

@Data
@Entity
@Table(name = "np_video")
public class GoodsVideoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long videoId;

    private Long parentId;

    private String videoName;

    private String videoUrl;//视频地址

    private String videoPic;//视频图片

    private String videoType;//视频类型

    private Long videoSize;//视频大小

    private Long videoTimeLong;//视频时长

    private int videoSort;//视频排序

    private String videoReason;//备注

    private Date createTime;

    private Date delTime;

    private String isEnable;//是否启用 '0'禁用 '1'启用

    private String delFlag;

    private String createUser;

    private String delUser;

    private String videoWatch;//1 全部观看 0 不能观看

    private Long watchNum;//播放次数

    private Long relayNum;//转发次数
}
