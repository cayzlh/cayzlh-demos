package com.cayzlh.designpatterns.abstractfactory.humandemo.human;

public class FemaleYellowHuman extends AbstractYellowHuman{

    @Override
    public void getSex() {
        System.out.println("黄人女性。");
    }
}
