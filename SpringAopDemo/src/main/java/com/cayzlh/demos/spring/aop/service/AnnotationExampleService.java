package com.cayzlh.demos.spring.aop.service;

import com.cayzlh.demos.spring.aop.annotation.AopDemo;
import org.springframework.stereotype.Service;

/**
 * @author cayzlh
 * @link https://github.com/cayzlh
 * @date 2020/03/31.
 */
@Service
public class AnnotationExampleService {

    @AopDemo
    public void annotationExample() {
        System.out.println("annotationExample()");
    }

}
