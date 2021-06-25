package com.cayzlh.designpatterns.buildermodel.cardemo.model;

public class BMWModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("宝马车启动..");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停止..");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车的喇叭声音..");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车的引擎声..");
    }
}
