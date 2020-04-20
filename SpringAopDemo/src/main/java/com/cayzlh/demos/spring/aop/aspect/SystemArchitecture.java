package com.cayzlh.demos.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author cayzlh
 * @link https://github.com/cayzlh
 * @date 2020/03/31.
 */
@Component
@Aspect
public class SystemArchitecture {

    @Pointcut("within(com.cayzlh.demos.spring.aop.service.impl.AopDemo1ServiceImpl)")
    public void inServiceLayer() {}

    @Pointcut("execution(* com.cayzlh.demos.spring.aop.service.AopDemoService.*(..))")
    public void businessService() {}

    @Pointcut("execution(* around*(..))")
    public void aroundExample() {}

    @Pointcut("@annotation(com.cayzlh.demos.spring.aop.annotation.AopDemo)")
    public void annotationExample() {}

    @Pointcut("this(com.cayzlh.demos.spring.aop.service.AopDemoService)")
    public void thisTest(){}

    @Pointcut("target(com.cayzlh.demos.spring.aop.service.AopDemo2ServiceImpl)")
    public void targetTest(){}
}
