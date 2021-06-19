package com.cayzlh.designpatterns.abstractfactory.productdemo.factory;

import com.cayzlh.designpatterns.abstractfactory.productdemo.product.AbstractProductA;
import com.cayzlh.designpatterns.abstractfactory.productdemo.product.AbstractProductB;
import com.cayzlh.designpatterns.abstractfactory.productdemo.product.ProductA1;
import com.cayzlh.designpatterns.abstractfactory.productdemo.product.ProductA2;
import com.cayzlh.designpatterns.abstractfactory.productdemo.product.ProductB1;
import com.cayzlh.designpatterns.abstractfactory.productdemo.product.ProductB2;

public class Creator2 extends AbstractCreator{

    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
