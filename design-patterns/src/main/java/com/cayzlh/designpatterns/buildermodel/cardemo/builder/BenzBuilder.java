package com.cayzlh.designpatterns.buildermodel.cardemo.builder;

import com.cayzlh.designpatterns.buildermodel.cardemo.model.BenzModel;
import com.cayzlh.designpatterns.buildermodel.cardemo.model.CarModel;
import java.util.ArrayList;

public class BenzBuilder extends CarBuilder{

    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
