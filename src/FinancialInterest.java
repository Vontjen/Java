import java.util.Scanner;

/**
 * Created by vdabcursist on 13/06/2017.
 */
public class FinancialInterest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double interestRate = 0.00417;
        System.out.println("Geef uw maandelijks spaarbedrag en sluit af met ENTER");
        double monthlySavings = keyboard.nextDouble();
        double totalSavings =0;
        for (int i =0; i < 12; i++){
            totalSavings = (totalSavings+monthlySavings)*(1+interestRate);

            if (i==5){
                System.out.println("na 6 maanden: "+Math.round(totalSavings));
            }

            if (i==11){
                System.out.println("na 12 maanden: "+Math.round(totalSavings));
            }
        }
    }
}
