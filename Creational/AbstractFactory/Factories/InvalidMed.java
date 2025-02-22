package DesignPatterns.Creational.AbstractFactory.Factories;

import DesignPatterns.Creational.AbstractFactory.Products.Medication;

public class InvalidMed extends Medication{

    public InvalidMed(String name, String dose) {
        
        super("Invalid Medication", "N/A");

    }
    
}
