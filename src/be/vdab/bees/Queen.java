package be.vdab.bees;

/**
 * Created by vdabcursist on 15/06/2017.
 */
public class Queen {

    private int hunger;
    private int power;
    private int eggsReady;

    public Queen(int power, int eggsReady) {
        if (power<0 || power >100){
            power = 80;
        }
        this.power = power;
        this.eggsReady=eggsReady;
    }

    public Egg[] layEgg(){
        Egg[] eggs = new Egg[eggsReady];
        for (int i=0; i<eggsReady; i++){
            System.out.println("be.vdab.bees.Queen is laying an egg ");
            eggs[i] = new Egg((int)(Math.random()*100));
            System.out.println("New egg weighs " + eggs[i].getWeight());

        }

        System.out.println("be.vdab.bees.Egg supply exhausted ");

        return eggs;
    }

    public String rule(){
        String status = new String();
        if (this.power==100){
            status="This queen is regarded as the god of all bees";
        }else if (this.power>80){
            status="The queen's reign is strong ";
        }else if (this.power > 60){
            status="the queen's reign is solid";
        }else if (this.power > 40){
            status="the queen's reign is dwindling";
        }else if (this.power >20){
            status="the queen's reign is weak";
        }else if (this.power > 0){
            status="the queen's reign is very weak, only the most loyal follow ";
        }else if (this.power == 0){
            status="the queen has lost her reign, nobody follows her";
        }
        System.out.println(status);
        return status;
    }
}
