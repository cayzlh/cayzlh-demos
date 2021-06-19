package com.cayzlh.designpatterns.abstractfactory.humandemo.human;

public class MaleYellowHuman extends AbstractYellowHuman{

    @Override
    public void getSex() {
        System.out.println("黄人男性。");
    }
}
