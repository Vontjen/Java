import java.util.Scanner;

/**
 * Created by Vontjen on 12-6-2017.
 */
public class StringManipulatr {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please state your name as \"firstname lastname\"");
        String naam = keyboard.nextLine();
        String[] splitst = naam.split("\\s+");
        System.out.println(splitst[0]+" "+splitst[1].toUpperCase());
    }
}
