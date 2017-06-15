package be.vdab.oefcursus;

import java.util.Scanner;

/**
 * Created by Vontjen on 12-6-2017.
 */
public class AverageOfThree {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input 3 (round) numbers, seperated by ENTER ");
        int one = keyboard.nextInt();
        int two = keyboard.nextInt();
        int three = keyboard.nextInt();

        double average = ((double)one + (double)two +(double)three )/3;

        System.out.println(average);
        System.out.println(Math.round(average));
    }
}
