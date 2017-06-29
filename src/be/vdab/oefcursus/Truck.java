package be.vdab.oefcursus;

import be.vdab.annotations.Coolness;

/**
 * Created by vdabcursist on 29/06/2017.
 */
public class Truck {

    public String model;
    public String brand;

    public Truck(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    @Override  //voor het overwriten van methoden van de superclass, in dit geval de impliciete superclass Object
    public String toString() {
        return this.getClass().getSimpleName();

    }
    @Deprecated //voor code die niet meer gebruikt wordt maar nog niet verwijderd kan worden
    public void barrelRoll(){
        System.out.println("You do a barrel roll with the Truck... somehow...");

    }
    @Coolness(level = 95)
    public void drive(int distance){
        System.out.println("Driving for "+distance+" km");
    }

    public void wash(){
        System.out.println("washing Truck");
    }


}
