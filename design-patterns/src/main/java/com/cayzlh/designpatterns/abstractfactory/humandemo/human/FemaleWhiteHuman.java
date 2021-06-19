package com.cayzlh.designpatterns.abstractfactory.humandemo.human;

public class FemaleWhiteHuman extends AbstractYellowHuman{

    @Override
    public void getSex() {
        System.out.println("白人女性。");
    }
}
