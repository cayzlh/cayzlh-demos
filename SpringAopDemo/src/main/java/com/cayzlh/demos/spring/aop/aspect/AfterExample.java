package com.cayzlh.demos.spring.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author cayzlh
 * @link https://github.com/cayzlh
 * @date 2020/03/31.
 */
@Component
@Aspect
public class AfterExample {

    @After("com.cayzlh.demos.spring.aop.aspect.SystemArchitecture.inServiceLayer()")
    public void doInServiceLayerPointCut() {
        System.out.println("匹配执行 : within(com.cayzlh.demos.spring.aop.service.AopDemoService.*)");
    }

    @After("com.cayzlh.demos.spring.aop.aspect.SystemArchitecture.businessService()")
    public void doBusinessServicePointCut() {
        System.out.println("匹配执行 : execution(* com.cayzlh.demos.spring.aop.service.AopDemoService.*(..))");
    }

}
