package DesignPatterns.Creational.AbstractFactory.Products;

import DesignPatterns.Creational.AbstractFactory.Interfaces.IDose;

public class Dose implements IDose{
    String units;
    String timeFrame;

    public Dose(String units, String timeframe){
        this.units = units;
        this.timeFrame = timeframe;
    }

    @Override
    public String display() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'display'");
    }
}
