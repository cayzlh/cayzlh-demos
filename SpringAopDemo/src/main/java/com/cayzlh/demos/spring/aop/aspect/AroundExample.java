package com.cayzlh.demos.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author cayzlh
 * @link https://github.com/cayzlh
 * @date 2020/03/31.
 */
@Component
@Aspect
public class AroundExample {

    @Around("com.cayzlh.demos.spring.aop.aspect.SystemArchitecture.aroundExample()")
    public Object doBusinessServicePointCut(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("匹配执行(* around*(..)).");

        // ,,,,
        Object retVal = pjp.proceed();
        // .....
        // stop stopwatch

        return retVal;
    }

}
