package be.vdab.oefcursus;



/**
 * Created by Vontjen on 18-6-2017 14:44.
 */
public class MyCircle {
    private MyPoint center;
    private int radius = 1;

    public MyCircle(int x, int y, int radius){
        center = new MyPoint(x,y);
        this.radius=radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX(){
        return center.getX();
    }

    public int getCenterY(){
        return center.getY();
    }

    public void setCenterXY(int x, int y){
        center.setX(x);
        center.setY(y);
    }

    @Override
    public String toString() {
        return "Circle @ ("+center.getX()+", "+center.getY()+") \n radius="+radius;

    }

    public double getArea(){
        double area = Math.PI * radius*radius;
        return area;
    }

}
