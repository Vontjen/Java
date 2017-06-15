package be.vdab.oefcursus;

import java.util.Scanner;

/**
 * Created by Vontjen on 12-6-2017.
 */
public class RunwayLength {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("give the speed in m/s");
        double speed = keyboard.nextDouble();
        System.out.println("give the acceleration in m/s²");
        double acceleration = keyboard.nextDouble();
        double length = (speed*speed)/(2*acceleration);
        System.out.println("You need "+Math.round(length)+"m of runway");
    }
}
