package weapon;

public class BaseballBat extends Weapon{

    private int baseDamage = 7;
    private int minHitReq = 7;
    private int weaponWeight = 6;
    private String type = "Baseball Bat";
    
    public BaseballBat() {
        
        super();
        super.SetBaseDamage(baseDamage);
        super.SetMinHitReq(minHitReq);
        super.SetType(type);
        super.SetWeaponWeight(weaponWeight);
    }
} // BaseballBat
