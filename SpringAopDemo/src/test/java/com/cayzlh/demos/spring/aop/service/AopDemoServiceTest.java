package com.cayzlh.demos.spring.aop.service;


import com.cayzlh.demos.spring.aop.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author cayzlh
 * @link https://github.com/cayzlh
 * @date 2020/03/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class AopDemoServiceTest {

    @Autowired
    @Qualifier("aopDemo1Service")
    public AopDemoService aopDemo1Service;

    @Autowired
    @Qualifier("aopDemo2Service")
    public AopDemoService aopDemo2Service;

    @Test
    public void test1() {
        aopDemo1Service.test1();
        System.out.println("----------------------------");
        aopDemo2Service.test1();
    }

    @Test
    public void aroundTest() {
        aopDemo1Service.aroundTest();
        System.out.println("----------------------------");
        aopDemo2Service.aroundTest();
    }

}