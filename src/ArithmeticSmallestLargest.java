import java.util.Scanner;

/**
 * Created by Vontjen on 12-6-2017.
 */
public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
        System.out.println("Give 3 numbers seperated by ENTER");
        Scanner keyboard = new Scanner(System.in);
        int getal1 = keyboard.nextInt();
        int getal2 = keyboard.nextInt();
        int getal3 = keyboard.nextInt();

        int som = getal1+getal2+getal3;
        int product = getal1*getal2*getal3;
        double gemiddelde = ((double)getal1+(double)getal2+(double)getal3)/3;
        int smallest = Math.min(Math.min(getal1,getal2),getal3);
        int largest = Math.max(Math.max(getal1,getal2),getal3);

        System.out.println("the sum is "+som);
        System.out.println("the average is "+gemiddelde);
        System.out.println("the product is "+product);
        System.out.println("the smallest number is "+smallest);
        System.out.println("the largest number is "+largest);
    }
}
