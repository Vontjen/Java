package be.vdab.bees;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public abstract class Bee extends Insect {
    protected String name;

    public Bee() {
    }

    public Bee(String name) {
        this.name = name;
    }

    public void fly(){
        System.out.println("Bee is flying around");
    }

    public String getName() {
        return name;
    }
}
