package be.vdab.animals;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public abstract class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name){
        this.name = name;

    }

    public abstract void sound();



}
