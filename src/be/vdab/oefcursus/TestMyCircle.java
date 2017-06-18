package be.vdab.oefcursus;

/**
 * Created by Vontjen on 18-6-2017 14:56.
 */
public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle circ = new MyCircle(9,5,4);
        MyPoint center = new MyPoint(2,4);
        MyCircle circa = new MyCircle(center,5);

        System.out.println(circ.getRadius());
        System.out.println(circ.getArea());
        System.out.println(circ.getCenterX());
        circ.setCenterXY(1,3);
        System.out.println(circ.getCenter());
        System.out.println(circa.toString());

    }
}
