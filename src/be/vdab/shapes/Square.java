package be.vdab.shapes;

/**
 * Created by vdabcursist on 20/06/2017.
 */
public class Square extends Rectangle {


    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide (double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return "A quare with side= "+ getSide()+", which is a subclass of "+ super.toString();
    }
}
