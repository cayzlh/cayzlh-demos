package com.cayzlh.designpatterns.factorymethod.humandemo.human;

public class YellowHuman implements Human{


    @Override
    public void getColor() {
        System.out.println("黄色");
    }

    @Override
    public void talk() {
        System.out.println("黄种人好看");
    }
}
