package DesignPatterns.Creational.AbstractFactory.Products;

import DesignPatterns.Creational.AbstractFactory.Interfaces.IDose;

public class AntibioticDose extends Dose implements IDose{

    public AntibioticDose(String units, String timeframe){
        super(units, timeframe);
    }

    @Override
    public String display() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'display'");
    }
    
}
