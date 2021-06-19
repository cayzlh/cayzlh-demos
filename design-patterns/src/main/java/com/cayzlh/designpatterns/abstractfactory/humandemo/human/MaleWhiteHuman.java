package com.cayzlh.designpatterns.abstractfactory.humandemo.human;

public class MaleWhiteHuman extends AbstractYellowHuman{

    @Override
    public void getSex() {
        System.out.println("白人男性。");
    }
}
