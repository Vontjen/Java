/**
 * Created by vdabcursist on 15/06/2017.
 */
public class Egg {
    private int weight;
    private int incubation =0;

    public Egg(int weight) {
        this.weight = weight;
    }


    public int getWeight() {
        return weight;
    }

    public int getIncubation() {
        return incubation;
    }

    public void setIncubation(int incubation) {
        this.incubation = incubation;
    }
}
