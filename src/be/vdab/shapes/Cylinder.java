package be.vdab.shapes;

/**
 * Created by vdabcursist on 20/06/2017.
 */
public class Cylinder {
    private double height;
    private Circle base;

    public Cylinder(double height, Circle base) {
        this.height = height;
        this.base = base;
    }

    private Cylinder(double heght, double radius){
        this.height = heght;
        this.base=new Circle(radius);
    }

    public double volume(){
        return base.area()*height;
    }
}