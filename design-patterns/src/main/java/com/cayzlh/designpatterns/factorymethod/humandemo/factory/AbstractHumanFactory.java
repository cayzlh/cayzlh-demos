package com.cayzlh.designpatterns.factorymethod.humandemo.factory;

import com.cayzlh.designpatterns.factorymethod.humandemo.human.Human;

public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> c);

}
