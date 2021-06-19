package com.cayzlh.designpatterns.abstractfactory.productdemo.factory;

import com.cayzlh.designpatterns.abstractfactory.productdemo.product.AbstractProductA;
import com.cayzlh.designpatterns.abstractfactory.productdemo.product.AbstractProductB;

public abstract class AbstractCreator {

    //创建A产品家族
    public abstract AbstractProductA createProductA();

    //创建B产品家族
    public abstract AbstractProductB createProductB();

}
