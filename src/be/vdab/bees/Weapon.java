package be.vdab.bees;

/**
 * Created by vdabcursist on 15/06/2017.
 */
public class Weapon {
    private int length;
    private int strength;
    private boolean sharpened = true;
    private int sharpnessCounter =0;

    public Weapon(int length, int strength) {
        this.length = length;
        this.strength = strength;
    }

    public int getLength() {
        return length;
    }

    public int getStrength() {
        return strength;
    }

    public boolean isSharpened() {
        return sharpened;
    }

    public void setSharpened(boolean sharpened) {
        this.sharpened = sharpened;
    }

    public int getSharpnessCounter() {
        return sharpnessCounter;
    }

    public void setSharpnessCounter(int sharpnessCounter) {
        this.sharpnessCounter = sharpnessCounter;
    }
}
