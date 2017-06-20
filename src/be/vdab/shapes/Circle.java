package be.vdab.shapes;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius=1.0;
    }

    public Circle(double radius) {
        super(); //optioneel, de contructor voert sowieso de default superconstructor uit als dit niet is opgegeven.
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /*
    better area and perimeter than getArea and getPerimeter, getters and setters only apply to initialized variables by convention.
     */

    public double area(){
        return Math.PI*radius*radius;

    }

    public double perimeter(){
        return 2*Math.PI*radius;

    }

    @Override
    public String toString() {
        return "A Circle with radius ="+radius+", which is a subclass of "+super.toString();
    }




}
