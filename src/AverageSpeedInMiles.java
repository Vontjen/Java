/**
 * Created by vdabcursist on 09/06/2017.
 */
public class AverageSpeedInMiles {
    public static void main(String[] args){

        double afstand = 14;
        int tijd = 45*60+30;

        int aantalSecondenPerUur =3600;

        double tijdInUren = tijd / (double)aantalSecondenPerUur;

        double kilometerPerUur = afstand/tijdInUren;

        double mijlPerKilometer=1.6;

        double mijlPerUur = kilometerPerUur/mijlPerKilometer;

        double eindresultaat = Math.round(mijlPerUur*100) / 100.0 ;

        System.out.println(eindresultaat+" mijl per uur");
        System.out.printf("%.2f", mijlPerUur); //alternatief voor afronding.


    }
}
