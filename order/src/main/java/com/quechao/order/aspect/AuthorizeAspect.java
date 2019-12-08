package com.quechao.order.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AuthorizeAspect {

    @Pointcut(value = "execution(public * com.quechao.order.controller.CustomerController.create*(..))")
    public void authorizeVerify() {
    }

    @Before("authorizeVerify()")
    public void doAuthorizeVerify() {

        System.out.println("controller认证");

    }

}
