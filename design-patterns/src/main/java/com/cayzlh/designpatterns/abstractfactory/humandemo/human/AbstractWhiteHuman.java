package com.cayzlh.designpatterns.abstractfactory.humandemo.human;

public abstract class AbstractWhiteHuman implements Human {

    //白色人种的皮肤颜色是白
    public void getColor() {
        System.out.println("白色");
    }

    //白色人种讲话
    public void talk() {
        System.out.println("白色人种讲话");
    }

}
