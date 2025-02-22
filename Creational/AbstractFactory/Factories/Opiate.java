package DesignPatterns.Creational.AbstractFactory.Factories;

import DesignPatterns.Creational.AbstractFactory.Products.Medication;

public class Opiate{

    private Opiate(){}

    public static Medication getMedication(String name){
        return new Medication(name, "1 / 8hr");
    }
    
}
