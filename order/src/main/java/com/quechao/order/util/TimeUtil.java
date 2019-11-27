package com.quechao.order.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {

    //返回string类型

    public static String getCurrentTime(String xx){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(new Date());
    }
    //返回date类型
    public static Date getCurrentTime(){
        return  new Date();
    }

}
