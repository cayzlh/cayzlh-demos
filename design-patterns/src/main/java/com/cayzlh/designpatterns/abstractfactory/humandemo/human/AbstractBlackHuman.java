package com.cayzlh.designpatterns.abstractfactory.humandemo.human;

public abstract class AbstractBlackHuman implements Human {

    public void getColor() {
        System.out.println("黑色");
    }

    public void talk() {
        System.out.println("黑色人种讲话");
    }

}
