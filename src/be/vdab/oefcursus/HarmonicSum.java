package be.vdab.oefcursus;

/**
 * Created by Vontjen on 17-6-2017 20:17.
 */
public class HarmonicSum {
    public static void main(String[] args) {
        int n = 5000;
        double sum =0;

        for (int i = 1; i<n;i++  ){
            sum += (1.0/i);
        }

        System.out.println(sum);

        sum =0;

        for (int i = n; i>0; i--){
            sum += (1.0/i);
        }

        System.out.println(sum);
    }
}
