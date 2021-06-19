package com.cayzlh.designpatterns.abstractfactory.humandemo.factory;

import com.cayzlh.designpatterns.abstractfactory.humandemo.human.Human;
import com.cayzlh.designpatterns.abstractfactory.humandemo.human.MaleWhiteHuman;
import com.cayzlh.designpatterns.abstractfactory.humandemo.human.MaleYellowHuman;

public class MaleHumanFactory implements HumanFactory{

    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleWhiteHuman();
    }
}
