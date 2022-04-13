package weapon;

public class PepperSpray extends Weapon {

    private int baseDamage = 3;
    private int minHitReq = 6;
    private int weaponWeight = 2;
    private String type = "Pepper Spray";

    public PepperSpray() {
        
        super();
        super.SetBaseDamage(baseDamage);
        super.SetMinHitReq(minHitReq);
        super.SetType(type);
        super.SetWeaponWeight(weaponWeight);
    }
} // PepperSpray
