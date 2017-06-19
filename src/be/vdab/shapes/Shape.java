package be.vdab.shapes;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class Shape {

    private String color;
    private boolean filled;

    public Shape(){
        this.color= "red";
        this.filled= true;
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
        String fill;
        if(filled) {fill= "filled";}
        else {fill = "Not filled";}
        return "A shape with color of "+color+" and "+fill;
    }
}
