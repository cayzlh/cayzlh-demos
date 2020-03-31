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
        System.out.println("匹配执行(com.cayzlh.demos.spring.aop.service.*).");
    }

    @After("com.cayzlh.demos.spring.aop.aspect.SystemArchitecture.businessService()")
    public void doBusinessServicePointCut() {
        System.out.println("匹配执行(* com.cayzlh.demos.spring..service.*.*(..)).");
    }

}
