import java.util.Scanner;

/**
 * Created by Vontjen on 12-6-2017.
 */
public class ComparingInteger {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Give 2 numbers, seperated by ENTER ");
        int getal1 = keyboard.nextInt();
        int getal2 = keyboard.nextInt();

        if(getal1==getal2){
            System.out.println("de getallen zijn gelijk");
        }else System.out.println(Math.max(getal1,getal2)+" is groter");
    }
}
