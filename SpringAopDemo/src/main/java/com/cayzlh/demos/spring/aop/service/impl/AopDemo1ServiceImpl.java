package com.cayzlh.demos.spring.aop.service.impl;

import com.cayzlh.demos.spring.aop.service.AopDemoService;
import org.springframework.stereotype.Service;

/**
 * @author cayzlh
 * @link https://github.com/cayzlh
 * @date 2020/03/31.
 */
@Service("aopDemo1Service")
public class AopDemo1ServiceImpl implements AopDemoService {

    @Override
    public void test1() {
        System.out.println("AopDemo1ServiceImpl:test1");
    }

    @Override
    public void aroundTest() {
        System.out.println("AopDemo1ServiceImpl:aroundTest");
    }

}
