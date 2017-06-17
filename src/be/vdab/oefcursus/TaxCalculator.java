package be.vdab.oefcursus;

import java.util.Scanner;

/**
 * Created by Vontjen on 17-6-2017 19:48.
 */
public class TaxCalculator {
    public static void main(String[] args) {
        int taxBracketOneMax =8680;
        int taxBracketTwoMin = 8681;
        int taxBracketTwoMax = 12360;
        int taxBracketThreeMin = 12361;
        int taxBracketThreeMax = 20600;
        int taxBracketFourMin = 20601;
        int taxBracketFourMax = 37750;
        int taxBracketFiveMin = 37750;

        Scanner s = new Scanner(System.in);

        System.out.println("Gross monthly income (in euro) ");
        double monthlyIncome = s.nextInt();
        double sociaSecurity = monthlyIncome/100*13.07;
        monthlyIncome -= sociaSecurity;
        System.out.printf("Social security (13.07): %.2f \n", sociaSecurity);
        System.out.printf("Taxable income: %.2f \n", monthlyIncome);
        double taxation;
        if (monthlyIncome*12 >= 0 && monthlyIncome*12 <= taxBracketOneMax){
            taxation = monthlyIncome/100*25;
            monthlyIncome -= taxation;
            System.out.printf("taxation: %.2f \n", taxation);
            System.out.printf("Monthly net income: %.2f", monthlyIncome);

        }else
        if (monthlyIncome*12 >= taxBracketTwoMin && monthlyIncome*12 <= taxBracketTwoMax){
            taxation = monthlyIncome/100*30;
            monthlyIncome -= taxation;
            System.out.printf("taxation: %.2f \n", taxation);
            System.out.printf("Monthly net income: %.2f", monthlyIncome);}

            else
        if (monthlyIncome*12 >= taxBracketThreeMin && monthlyIncome*12 <= taxBracketThreeMax){
            taxation = monthlyIncome/100*40;
            monthlyIncome -= taxation;
            System.out.printf("taxation: %.2f \n", taxation);
            System.out.printf("Monthly net income: %.2f", monthlyIncome);}

            else
        if (monthlyIncome*12 >= taxBracketFourMin && monthlyIncome*12 <= taxBracketFourMax){
            taxation = monthlyIncome/100*45;
            monthlyIncome -= taxation;
            System.out.printf("taxation: %.2f \n", taxation);
            System.out.printf("Monthly net income: %.2f", monthlyIncome);}
            else
        if (monthlyIncome*12 > taxBracketFiveMin){
            taxation = monthlyIncome/100*50;
            monthlyIncome -= taxation;
            System.out.printf("taxation: %.2f \n", taxation);
            System.out.printf("Monthly net income: %.2f", monthlyIncome);}



    }
}
