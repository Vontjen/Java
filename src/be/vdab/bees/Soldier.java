package be.vdab.bees;

/**
 * Created by vdabcursist on 15/06/2017.
 */
public class Soldier {

    private double health;
    private int armour;
    private Weapon weapon;

    public Soldier(double health, int armour, Weapon weapon) {
        this.health = health;
        this.armour = armour;
        this.weapon = weapon;
    }

    public int attack(Soldier soldier){
        int damageDone;
        if(weapon.isSharpened()==true){
            damageDone = (weapon.getStrength());
            soldier.setHealth(soldier.defend(damageDone)) ;
            weapon.setSharpnessCounter(weapon.getSharpnessCounter()+1);

            if(weapon.getSharpnessCounter()==5){
                weapon.setSharpened(false);
                System.out.println("This bee can't attack anymore ");
                this.health=0;

            }

        }
        else {
            damageDone =0;
        }

        return damageDone;

    }

    public int defend(int damageReceived){
        if(this.armour>=100){
            armour -= damageReceived;
            System.out.println("FULLY BUFFED - NO DAMAGE TAKEN");

        }else {
            armour -= damageReceived;
            double damageInflicted = (damageReceived - (damageReceived * (armour / 100.0)));
            System.out.println("DMG INFLICTED: " + damageInflicted);
            this.health= health- damageInflicted;
        }
        return (int)this.health;
    }

    public boolean isDefeated(){
        if(health<=0){
            return true;
        }else {
            return false;
        }
    }

    public double getHealth() {
        return health;
    }

    public int getArmour() {
        return armour;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setHealth(double health) {
        this.health = health;
    }
}
