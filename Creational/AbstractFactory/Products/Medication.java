package DesignPatterns.Creational.AbstractFactory.Products;

public class Medication {

    String medName;
    String dose;
    
    public Medication(String name, String dose){
        this.medName = name;
        this.dose = dose;
    }

    public void getDescription(){
        System.out.println("Created " + this.medName + ". Take this medication " + dose + ".");
    }
}
