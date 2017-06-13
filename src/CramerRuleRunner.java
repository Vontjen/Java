import java.util.Scanner;

/**
 * Created by vdabcursist on 13/06/2017.
 */
public class CramerRuleRunner {
    public static void main(String[] args) {
        System.out.println("Geef a,b,c,d,e,f");
        Scanner keyboard = new Scanner(System.in);
        double[] restult = CramersRuleFunction.cramer(
                keyboard.nextDouble(),
                keyboard.nextDouble(),
                keyboard.nextDouble(),
                keyboard.nextDouble(),
                keyboard.nextDouble(),
                keyboard.nextDouble());
        System.out.printf("x = %.2f \ny = %.2f", restult[0],restult[1]);;
    }
}
