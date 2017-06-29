package be.vdab.Lambdas;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by vdabcursist on 29/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Tjen");
        names.add("Simon");
        names.add("Prema");
        names.add("Gerda");
        names.add("Kathleen");
        names.add("Saliou");
        names.add("Farhood");
        names.add("Bart");


        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            } //This is how it would have to be done before java 8
        });


        for (String name: names){
            System.out.println(name);
        }

        Collections.sort(names, (String a, String b) -> {
            return (b.compareTo(a));}
            );

        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });


        Collections.sort(names, (a,b) -> b.compareTo(a));

        names.forEach(s -> System.out.println(s));

        names.forEach(System.out::println);

        names.removeIf(s -> !s.startsWith("S"));


    }


}















