package com.cayzlh.designpatterns.factorymethod.humandemo.factory;

import com.cayzlh.designpatterns.factorymethod.humandemo.human.BlackHuman;
import com.cayzlh.designpatterns.factorymethod.humandemo.human.Human;

public class BlackHumanFactory3 extends AbstractHumanFactory3{

    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
