package DesignPatterns.Creational.AbstractFactory.Factories;

import DesignPatterns.Creational.AbstractFactory.Products.Medication;

public class Antibiotic{

   private Antibiotic(){}

   public static Medication getMedication(String name){
    return new Medication(name, "1 / 4hr");
   }
    
}
