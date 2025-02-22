package DesignPatterns.Creational.AbstractFactory.Factories;

import DesignPatterns.Creational.AbstractFactory.Products.Medication;

public class MedicationFactory {
    
    private MedicationFactory(){}

    public static Medication getMedication(String medName){
        switch (medName) {
            case "Antibiotic":
                return Antibiotic.getMedication(medName);
            case "Opiate":
                return Opiate.getMedication(medName);
            case "NSAID":
                return NSAID.getMedication(medName);    

            default:
                return new InvalidMed("Invalid Medication", "N/A");
        }
    }
}
