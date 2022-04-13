package weapon;

public class Kick extends Weapon {

    private int baseDamage = 6;
    private int minHitReq = 6;
    private int weaponWeight = 3;
    private String type = "Kick";

    public Kick() {
        
        super();
        super.SetBaseDamage(baseDamage);
        super.SetMinHitReq(minHitReq);
        super.SetType(type);
        super.SetWeaponWeight(weaponWeight);
    }
} // Kick