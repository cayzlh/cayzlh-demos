package com.cayzlh.designpatterns.abstractfactory.humandemo.human;

public class MaleBlackHuman extends AbstractYellowHuman{

    @Override
    public void getSex() {
        System.out.println("黑人男性。");
    }
}
