package be.vdab.oefcursus;

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

    @Override
    public String toString() {
        return this.getClass().getSimpleName();

    }

    public void barrelRoll(){
        System.out.println("You do a barrel roll with the Truck... somehow...");

    }

    public void drive(int distance){
        System.out.println("Driving for "+distance+" km");
    }

    public void wash(){
        System.out.println("washing Truck");
    }


}
