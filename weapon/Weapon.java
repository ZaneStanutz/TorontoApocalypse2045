package weapon;

import java.util.Random;

public abstract class Weapon {
    protected int baseDamage;
    private int minHitReq;
    private int weaponWeight;
    private Random randNum = new Random();
    private String type;

    public Weapon() { } 

    // getters
    public String GetType() {
        return this.type;
    }
    public int GetWeaponWeight() {
        return this.weaponWeight;
    }

    public int GetBaseDamage() {
        return this.baseDamage;
    }
    
    public int Strike(int type, int strength, int dexterity,int weaponWeight, int damageMultiplier) {
        int damage = 0;

        // duplicate code so we dont increment the weapon prop baseDamage everytime player selects heavy attack
        if(type == 2) {
            int roll = randNum.nextInt(10) + 1; //base dice roll
            dexterity -= weaponWeight; // reduce dex based off weaponweight

            //add char dex to increase chances of hit
            int chance = roll + dexterity;

            if(chance >= (minHitReq + 1)) { // its a hit  
                damage = (randNum.nextInt(strength) + (baseDamage + 2)) * damageMultiplier;
            }
        }
        else {
            int roll = randNum.nextInt(10) + 1; //base dice roll
            dexterity -= weaponWeight; // reduce dex based off weaponweight

            //add char dex to increase chances of hit
            int chance = roll + dexterity;

            if(chance >= minHitReq) { // its a hit
                damage = (randNum.nextInt(strength) + baseDamage) * damageMultiplier;
            }
        }
        return damage;
    }

    // setters
    public void SetBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }
    
    public void SetMinHitReq(int minHitReq) {
        this.minHitReq = minHitReq;
    }
    
    public void SetType(String type) {
        this.type = type;
    }

    public void SetWeaponWeight(int weaponWeight) {
        this.weaponWeight = weaponWeight;
    }
    
} // Weapon
