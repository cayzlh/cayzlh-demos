package com.cayzlh.designpatterns.abstractfactory.humandemo.factory;

import com.cayzlh.designpatterns.abstractfactory.humandemo.human.Human;

public interface HumanFactory {

    //制造一个黄色人种
    public Human createYellowHuman();
    //制造一个白色人种
    public Human createWhiteHuman();
    //制造一个黑色人种
    public Human createBlackHuman();

}
