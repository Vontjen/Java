/**
 * Created by vdabcursist on 15/06/2017.
 */
public class Beehive {
    public static void main (String[] args){
        Worker w1 = new Worker("Maya", 100);
        Worker w2 = new Worker("Jimi", 75);
        Worker w3 = new Worker("Amy", 50);
        Queen beyonce = new Queen(0, 120);
        Soldier bumble = new Soldier(100,0,new Weapon(30,2));
        Soldier tumble = new Soldier(100, 0, new Weapon(20,3));


        while (bumble.isDefeated() == false && tumble.isDefeated() == false){
            bumble.attack(tumble);
            System.out.println("bumble has "+bumble.getHealth()+" remaining");
            tumble.attack(bumble);
            System.out.println("tumble had "+tumble.getHealth()+" remaining");
        }

        if (tumble.isDefeated()){
            System.out.printf("Tumble is defeated!");
        }else{
            System.out.println("Bumble is defeated!");
        }






    }
}
