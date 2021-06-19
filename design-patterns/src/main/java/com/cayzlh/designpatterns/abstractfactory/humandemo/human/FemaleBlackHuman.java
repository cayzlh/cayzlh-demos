package com.cayzlh.designpatterns.abstractfactory.humandemo.human;

public class FemaleBlackHuman extends AbstractYellowHuman{

    @Override
    public void getSex() {
        System.out.println("黑人女性。");
    }
}
