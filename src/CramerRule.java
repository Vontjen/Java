import java.util.Scanner;

/**
 * Created by Vontjen on 12-6-2017.
 */
public class CramerRule {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("We'll calculate the value of x and y using Cramer's rule. Please follow this format");
        System.out.println("ax + by = e");
        System.out.println("cx + dy = f");
        System.out.println("Provide the value of a");
        double a = keyboard.nextDouble();
        System.out.println("provide the value of b");
        double b = keyboard.nextDouble();
        System.out.println("provide the value of e");
        double e = keyboard.nextDouble();
        System.out.println("provide the balue of c");
        double c = keyboard.nextDouble();
        System.out.println("provide the value of d");
        double d = keyboard.nextDouble();
        System.out.println("provide the value of f");
        double f = keyboard.nextDouble();

        double x = (e*d-b*f)/(a*d-b*c);
        double y = (a*f-e*c)/(a*d-b*c);

        System.out.println("x= "+x);
        System.out.println("y= "+y);
    }
}
