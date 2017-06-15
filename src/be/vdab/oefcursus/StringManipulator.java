package be.vdab.oefcursus;

import java.util.Scanner;

/**
 * Created by Vontjen on 12-6-2017.
 */
public class StringManipulator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please state your name as \"firstname lastname\"");
        String voornaam = keyboard.next();
        String achternaam = keyboard.next();
        System.out.println(voornaam+" "+ achternaam.toUpperCase());
    }
}
