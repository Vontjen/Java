package be.vdab.shapes;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public abstract class Shape {

    private String color;
    private boolean filled;

    public Shape(){
        //optie 1
        //this.color= "red";
        //this.filled= true;
        //optie 2
        this("red", true);

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A shape with color of "+color+" and "+(!filled? "not ": "" )+"filled in";
    }

    public abstract double area();

    public abstract double perimeter();





}
