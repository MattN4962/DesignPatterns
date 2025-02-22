package DesignPatterns.Creational.AbstractFactory;

import DesignPatterns.Creational.AbstractFactory.Factories.MedicationFactory;
import DesignPatterns.Creational.AbstractFactory.Products.Medication;

public class MedicationClient {
    
    public static void main(String[] args) {
        Medication penicillin = MedicationFactory.getMedication("Antibiotic");
        penicillin.getDescription();
        System.out.println();

        Medication vicodin = MedicationFactory.getMedication("Opiate");
        vicodin.getDescription();
        System.out.println();

        Medication ibuprofen = MedicationFactory.getMedication("NSAID");
        ibuprofen.getDescription();
        System.out.println();
    }
}
