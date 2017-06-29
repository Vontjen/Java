package be.vdab.shapes;

/**
 * Created by vdabcursist on 20/06/2017.
 */
public class ShapeRunner {
    public static void main(String[] args) {
        Rectangle r =new Rectangle(5,7 );

        Square s = new Square(8);

        Circle c = new Circle("red",false, 5);

        System.out.println(c.area());

        System.out.println(r.toString());

    }
}
