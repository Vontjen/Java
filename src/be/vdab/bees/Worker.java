package be.vdab.bees;

/**
 * Created by Vontjen on 15/06/2017 01:50 .
 */

public class Worker extends Bee {
    private int capacity;
    private int load= 0;

    public Worker(){
        this("John Doe", 100, 0);
    }

    public Worker(String name, int capacity) {
        this(name,capacity,0);
    }

    public Worker(String name, int capacity, int load) {
        super(name);
        this.capacity = capacity;
        this.load = load;
    }

    public boolean gatherNectar(int howMuch){
        System.out.println("Worker " + name +" is gathering some nectar");
        load += howMuch;
        if(load == capacity){
            System.out.println(name+ " is full");
            return  false;
        } else{
            System.out.println(name + " has " + (capacity-load)+" left over");
            return true;
        }


    }

    public String returnHome(){
        String homeBound = "worker is returning home";
        return homeBound;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getLoad(){
        return load;
    }

    public String getName() {
        return name;
    }

}
