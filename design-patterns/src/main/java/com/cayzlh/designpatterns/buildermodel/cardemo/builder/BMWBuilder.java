package com.cayzlh.designpatterns.buildermodel.cardemo.builder;

import com.cayzlh.designpatterns.buildermodel.cardemo.model.BMWModel;
import com.cayzlh.designpatterns.buildermodel.cardemo.model.CarModel;
import java.util.ArrayList;

public class BMWBuilder extends CarBuilder{

    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
