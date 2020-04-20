package com.cayzlh.demos.spring.aop.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author cayzlh
 * @link https://github.com/cayzlh
 * @date 2020/04/08.
 */
@Component
public class AwareDemoService implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext....");
    }
}
