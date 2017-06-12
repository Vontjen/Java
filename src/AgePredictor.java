import java.util.Scanner;

/**
 * Created by Vontjen on 12-6-2017.
 */
public class AgePredictor {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is you first name?");
        String name = keyboard.nextLine();
        System.out.println("What is your age? ");
        int age = keyboard.nextInt()+1;

        System.out.println("Hello "+name+"! Next year you will be "+age);
    }
}
