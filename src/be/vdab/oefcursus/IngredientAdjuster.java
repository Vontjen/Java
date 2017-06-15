package be.vdab.oefcursus;

import java.util.Scanner;

/**
 * Created by Vontjen on 12-6-2017.
 */
public class IngredientAdjuster {
    public static void main(String[] args) {
        double sugar = 2;
        double butter = 1;
        double flour = 2.75;
        double coockiesProduced = 48;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hoeveel koekjes wil u maken? ");
        int aantalKoekjes = keyboard.nextInt();
        System.out.println(sugar/coockiesProduced*aantalKoekjes+" cups of sugar");
        System.out.println(butter/coockiesProduced*aantalKoekjes+" cups of butter");
        System.out.println(flour/coockiesProduced*aantalKoekjes+" cups of flour");

    }
}
