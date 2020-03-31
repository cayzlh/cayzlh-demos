package com.cayzlh.demos.spring.aop.service;

import org.springframework.stereotype.Service;

/**
 * @author cayzlh
 * @link https://github.com/cayzlh
 * @date 2020/03/31.
 */
@Service("aopDemo2Service")
public class AopDemo2ServiceImpl implements AopDemoService {

    @Override
    public void test1() {
        System.out.println("AopDemo2ServiceImpl:test1");
    }

    @Override
    public void aroundTest() {
        System.out.println("AopDemo2ServiceImpl:aroundTest");
    }

}
