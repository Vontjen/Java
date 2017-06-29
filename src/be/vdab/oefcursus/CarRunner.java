package be.vdab.oefcursus;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * Created by vdabcursist on 29/06/2017.
 */
public class CarRunner {

    public static void main(String[] args) {
        Truck t = new Truck("m5", "bmw");


        System.out.println(t);
        t.wash();
        t.drive(20);
        t.barrelRoll();
        Class clazz = t.getClass();

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());

        System.out.println(t);


        Field field[] = t.getClass().getFields();

        for (int i =0;i< field.length; i++){

            Field f = field[i];
            System.out.println(f.getName());
        }

        Method[] mth = t.getClass().getMethods();


        for (int i =0; i< mth.length ; i++){

            Method m = mth[i];
            System.out.println(m.getName());
            System.out.println("\t " +m.getReturnType());
            Class ty[] = m.getParameterTypes();




            for (int j =0; j<ty.length; j++){
                Type type = ty[0];
                System.out.println("\t \t"  + type);
            }


        }








    }
}
