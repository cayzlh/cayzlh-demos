package com.cayzlh.designpatterns.abstractfactory.productdemo;

import com.cayzlh.designpatterns.abstractfactory.productdemo.factory.AbstractCreator;
import com.cayzlh.designpatterns.abstractfactory.productdemo.factory.Creator1;
import com.cayzlh.designpatterns.abstractfactory.productdemo.factory.Creator2;
import com.cayzlh.designpatterns.abstractfactory.productdemo.product.AbstractProductA;
import com.cayzlh.designpatterns.abstractfactory.productdemo.product.AbstractProductB;

public class Client {

    public static void main(String[] args) {
        //定义出两个工厂
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();
        //产生A1对象
        AbstractProductA a1 =  creator1.createProductA();
        //产生A2对象
        AbstractProductA a2 = creator2.createProductA();
        //产生B1对象
        AbstractProductB b1 = creator1.createProductB();
        //产生B2对象
        AbstractProductB b2 = creator2.createProductB();

        /**
         * other
         */
    }

}
