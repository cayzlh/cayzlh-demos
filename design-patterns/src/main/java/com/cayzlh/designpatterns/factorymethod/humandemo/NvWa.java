package com.cayzlh.designpatterns.factorymethod.humandemo;

import com.cayzlh.designpatterns.factorymethod.humandemo.factory.AbstractHumanFactory;
import com.cayzlh.designpatterns.factorymethod.humandemo.factory.HumanFactory;
import com.cayzlh.designpatterns.factorymethod.humandemo.human.BlackHuman;
import com.cayzlh.designpatterns.factorymethod.humandemo.human.Human;
import com.cayzlh.designpatterns.factorymethod.humandemo.human.WhiteHuman;
import com.cayzlh.designpatterns.factorymethod.humandemo.human.YellowHuman;

public class NvWa {

    public static void main(String[] args) {
        AbstractHumanFactory humanFactory = new HumanFactory();
        System.out.println("----造白人START----");
        Human whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("----造白人END----");

        System.out.println("----造黄种人START----");
        Human yellowHuman = humanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
        System.out.println("----造黄种人END----");

        System.out.println("----造黑人START----");
        Human blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        System.out.println("----造黑人END----");
    }

}
