/**
 * Created by vdabcursist on 15/06/2017.
 */
public class Soldier {

    private int health;
    private int armour;
    private Weapon weapon;

    public Soldier(int health, int armour) {
        this.health = health;
        this.armour = armour;
    }

    public int attack(){
        int damageDone;
        if(weapon.isSharpened()==true){
            damageDone = (weapon.getStrength());
            weapon.setSharpnessCounter(+1);

            if(weapon.getSharpnessCounter()==5){
                weapon.setSharpened(false);

            }

        }
        else {
            damageDone =0;
        }

        return damageDone;

    }

    public int defend(int damageReceived){
        if(this.armour>=100){
            damageReceived=0;
            armour -= damageReceived;
        }else {
            damageReceived= damageReceived - (damageReceived * (armour/100));
        }
        return damageReceived;
    }

    public boolean isDefeated(){
        if(health==0){
            return true;
        }else {
            return false;
        }
    }
}
