package com.cayzlh.designpatterns.abstractfactory.humandemo.human;

public abstract class AbstractYellowHuman implements Human {

    public void getColor() {
        System.out.println("黄色");
    }

    public void talk() {
        System.out.println("黄色人种讲话");
    }

}
