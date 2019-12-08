package com.quechao.order.service;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class LoggerTest {

    //private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    //你写哪个loggerTest打印的时候的类就是哪个，如果你写loggerTest2，那么就是loggerTest2

    @Test//这是junit包下的内容
    public void test1() {

        log.info("info,{}", "阿拉错了");
        log.error("error,{}", "这次输出的是error");


    }
}
