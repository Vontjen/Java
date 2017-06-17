package be.vdab.oefcursus;

import java.util.Scanner;

/**
 * Created by Vontjen on 17-6-2017 19:40.
 */
public class PrintNumberInWord {
    public static void main(String[] args) {
        int choice;
        Scanner s = new Scanner(System.in);

        System.out.println("type a number between 1 and 9 ");
        choice = s.nextInt();

        switch (choice){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
                default:
                    System.out.println("OTHER");

        }
    }
}
