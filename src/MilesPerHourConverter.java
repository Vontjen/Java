/**
 * Created by vdabcursist on 13/06/2017.
 */
public class MilesPerHourConverter {
    public static double milesPerHour (double afstandInKm, int tijdInSeconden ){
        double tijdInUren = tijdInSeconden/3600;
        double kilometerPerUur = afstandInKm/tijdInUren;
        double mijlPerKilometer = 1.6;
        double resultaat = kilometerPerUur/mijlPerKilometer;
        return resultaat;
    }
}
