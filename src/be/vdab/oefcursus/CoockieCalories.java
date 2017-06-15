package be.vdab.oefcursus;

import java.util.Scanner;

/**
 * Created by Vontjen on 12-6-2017.
 */
public class CoockieCalories {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int coockies = 40;
        int servings = 10;
        int caloriesPerServing = 300;
        System.out.println("Hoeveel koekjes heeft u gehad? ");
        int ammount = keyboard.nextInt();
        System.out.println("U heeft "+(ammount*caloriesPerServing)/(coockies/servings)+ " calorieën geconsumeerd" );

    }
}
