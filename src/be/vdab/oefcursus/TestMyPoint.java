package be.vdab.oefcursus;


/**
 * Created by Vontjen on 18-6-2017 14:34.
 */
public class TestMyPoint {
    public static void main(String[] args) {

        MyPoint p[] = new MyPoint[100];

        for (int i =0 ; i<10; i++){

            p[i]= new MyPoint(i+1,i+1);
            System.out.println(p[i].toString());
        }



    }
}
