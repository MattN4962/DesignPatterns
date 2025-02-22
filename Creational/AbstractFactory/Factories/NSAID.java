package DesignPatterns.Creational.AbstractFactory.Factories;

import DesignPatterns.Creational.AbstractFactory.Products.Medication;

public class NSAID {

    private NSAID() {

    }

    public static Medication getMedication(String medName){
        return new Medication(medName, "2 / 12hr");
    }

}
