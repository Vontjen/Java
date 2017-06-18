package be.vdab.oefcursus;

/**
 * Created by Vontjen on 18-6-2017 17:19.
 */
public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle triangle = new MyTriangle(2,3,4,5,6,7);

        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.toString());
    }
}
