package com.cayzlh.designpatterns.factorymethod.productdemo;

import com.cayzlh.designpatterns.factorymethod.productdemo.factory.ConcreteCreator;
import com.cayzlh.designpatterns.factorymethod.productdemo.factory.Creator;
import com.cayzlh.designpatterns.factorymethod.productdemo.product.ConcreteProduct1;
import com.cayzlh.designpatterns.factorymethod.productdemo.product.Product;

public class Client {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        /*
         * 继续业务处理
         */
    }

}
