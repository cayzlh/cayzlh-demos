package com.cayzlh.designpatterns.abstractfactory.productdemo.factory;

import com.cayzlh.designpatterns.abstractfactory.productdemo.product.AbstractProductA;
import com.cayzlh.designpatterns.abstractfactory.productdemo.product.AbstractProductB;
import com.cayzlh.designpatterns.abstractfactory.productdemo.product.ProductA1;
import com.cayzlh.designpatterns.abstractfactory.productdemo.product.ProductB1;

public class Creator1 extends AbstractCreator{

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
