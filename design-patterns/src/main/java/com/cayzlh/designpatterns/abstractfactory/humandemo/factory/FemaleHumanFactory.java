package com.cayzlh.designpatterns.abstractfactory.humandemo.factory;

import com.cayzlh.designpatterns.abstractfactory.humandemo.human.FemaleWhiteHuman;
import com.cayzlh.designpatterns.abstractfactory.humandemo.human.FemaleYellowHuman;
import com.cayzlh.designpatterns.abstractfactory.humandemo.human.Human;

public class FemaleHumanFactory implements HumanFactory{

    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleWhiteHuman();
    }
}
