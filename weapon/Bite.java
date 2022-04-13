package weapon;

public class Bite extends Weapon {
 
    private int baseDamage = 4;
    private int minHitReq = 5; 
    private int weaponWeight = 1;
    private String type = "Bite";

    public Bite() {
        
        super();
        super.SetBaseDamage(baseDamage);
        super.SetMinHitReq(minHitReq);
        super.SetType(type);
        super.SetWeaponWeight(weaponWeight);
    }     
} // Bite
