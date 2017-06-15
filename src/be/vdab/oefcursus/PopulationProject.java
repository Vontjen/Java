package be.vdab.oefcursus;

/**
 * Created by Vontjen on 12-6-2017.
 */
public class PopulationProject {
    public static void main(String[] args) {
        int birthPerYear = (365*24*60*60)/7;
        int deathperYear = (365*24*60*60)/7;
        int immigrationPerYear = (365*24*60*60)/45;
        int currentTotal = 312032486;

        System.out.println("vandaag: "+currentTotal);
        currentTotal=currentTotal+birthPerYear+immigrationPerYear-deathperYear;
        System.out.println("volgend jaar: "+currentTotal);
        currentTotal=currentTotal+birthPerYear+immigrationPerYear-deathperYear;
        System.out.println("binnen 2 jaar: "+currentTotal);
        currentTotal=currentTotal+birthPerYear+immigrationPerYear-deathperYear;
        System.out.println("binnen 3 jaar: "+currentTotal);
        currentTotal=currentTotal+birthPerYear+immigrationPerYear-deathperYear;
        System.out.println("binnen 4 jaar: "+currentTotal);
        currentTotal=currentTotal+birthPerYear+immigrationPerYear-deathperYear;
        System.out.println("binnen 5 jaar: "+currentTotal);




    }
}
