package weapon;

public class LimpWrists extends Weapon {

    private int baseDamage = 3;
    private int minHitReq = 2;
    private int weaponWeight = 0;
    private String type = "Limp Wrists";

    public LimpWrists() {

        super();
        super.SetBaseDamage(baseDamage);
        super.SetMinHitReq(minHitReq);
        super.SetType(type);
        super.SetWeaponWeight(weaponWeight);
    }
} // LimpWrists
