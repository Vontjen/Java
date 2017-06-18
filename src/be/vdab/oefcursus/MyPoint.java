package be.vdab.oefcursus;

/**
 * Created by Vontjen on 18-6-2017 14:24.
 */
public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public String toString() {
        return "("+x+", "+y+")";
    }

    public double distance(int x2, int y2){
        double distance=Math.sqrt(Math.pow((x2-x),2) + Math.pow((y2-y),2));
        return distance;

    }

    public double distance(MyPoint another){
        double distance=Math.sqrt(Math.pow((another.getX()-x),2) + Math.pow((another.getY()-y),2));
        return distance;
    }
}
