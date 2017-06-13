import java.util.Scanner;

/**
 * Created by Vontjen on 12-6-2017.
 */
public class NameAndInitials {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Geef uw voornaam en sluit met ENTER");
        String firstName =new String();
        firstName = keyboard.nextLine();
        System.out.println("Geef uw middel name en sluit met ENTER");
        String middleName = new String();
        middleName = keyboard.nextLine();
        System.out.println("Geef uw achternaam en sluit met ENTER");
        String lastName = new String();
        lastName = keyboard.next();
        char initFirstName = firstName.charAt(0);
        char initMiddleName = middleName.charAt(0);
        char initLastName = lastName.charAt(0);
        System.out.print(initFirstName+""+initMiddleName+""+initLastName);






    }
}
