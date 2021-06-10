package com.cayzlh.designpatterns.factorymethod.productdemo.factory;

import com.cayzlh.designpatterns.factorymethod.productdemo.product.Product;

public class ConcreteCreator extends Creator {

    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            //异常处理
        }
        return (T) product;

    }
}
