/**
 * Created by Vontjen on 12-6-2017.
 */
public class PriceTax {
    public static void main(String[] args) {
        int price = 35;
        int quantity = 5;
        double tax = 0.21;

        double total = (price * quantity) + (price*quantity*tax);

        System.out.println("The total price is €"+total);
    }


}
