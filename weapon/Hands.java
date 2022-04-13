package weapon;

public class Hands extends Weapon {

    private int baseDamage = 5;
    private int minHitReq = 4;
    private int weaponWeight = 2;
    private String type = "Hands";
    
    public Hands() {
        
        super();
        super.SetBaseDamage(baseDamage);
        super.SetMinHitReq(minHitReq);
        super.SetType(type);
        super.SetWeaponWeight(weaponWeight);
    }    
} // Hands
