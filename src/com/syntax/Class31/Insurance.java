package com.syntax.Class31;

import java.util.ArrayList;
import java.util.Iterator;


public abstract class Insurance {
    /*
    Create a class Insurance that will have an attribute as insuranceName and unimplemented
     behaviour as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health.
     Car class has it’s own attribute as carModel and Class Pet has petType attribute.
     Create 3 objects of the sub classes and store them in ArrayList.
     Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    Insurance(String name) {
        this.insuranceName = name;
    }

    String insuranceName;
    abstract void getQuote();
    abstract void cancelInsurance();

}

class Car extends Insurance{
    String carModel;
    Car(String name, String carModel){
        super(name);
        this.carModel=carModel;
    }

    @Override
    void getQuote() {
        System.out.println("Your car insurance will be $100 with "+insuranceName+" for your "+carModel);
    }
    @Override
    void cancelInsurance() {
        System.out.println("Your Car Insurance has been canceled");
    }
}
class Pet extends Insurance{
    String petType;
    Pet(String name, String type){
        super(name);
        this.petType=type;
    }
    @Override
    void getQuote() {
        System.out.println("Your Pet insurance will be $20 with "+insuranceName+" for your "+petType);
    }
    @Override
    void cancelInsurance() {
        System.out.println("Your Pet Insurance has been canceled");
    }
}
class Health extends Insurance {
    Health(String name) {
        super(name);
    }

    @Override
    void getQuote() {
        System.out.println("Your Health insurance will be $300 with " + insuranceName);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Your Health Insurance has been canceled");
    }

    public static void main(String[] args) {
        Car car = new Car("Geico", "BMW");
        Pet pet = new Pet("Pet Smart", "Husky");
        Health health = new Health("Cigna");

        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(car);
        insurances.add(pet);
        insurances.add(health);
        System.out.println("--------------------------Using Enhanced for loop----------------------------------");
        for (Insurance Objects : insurances) {
            Objects.getQuote();
            Objects.cancelInsurance();
}

        System.out.println("--------------------------Using Normal for loop----------------------------------");
            for (int i = 0; i < insurances.size(); i++) {
                System.out.println(insurances.get(i));
            }
                System.out.println("--------------------------Using Iterator----------------------------------");
                Iterator<Insurance> iterator = insurances.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        }
