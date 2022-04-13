
package characters;
import weapon.*;
import armour.*;

public class Racoon extends Character{

    private String type = "Racoon";
    private String[] names = {"Fluffykins", "Tico", "RJ", "Gizmo"};
    private String ability = "OMG soooooo cuuute";
    private String abilityFunction = " Increase damage multiplier";
    private int minHealth = 12;
    private int minStrength = 1;
    private int minDexterity = 8;
    private Armour armour = new Fur();
    private Weapon weapon = new Bite();
    
    public Racoon(String name) {
        super(name);
        super.SetType(type);
        super.SetHealth(minHealth + randNum.nextInt(statBonus) + 1);
        super.SetStrength(minStrength + randNum.nextInt(statBonus) + 1);
        super.SetDexterity(minDexterity + randNum.nextInt(statBonus) + 1);
        super.SetArmour(armour);
        super.SetWeapon(weapon);
        super.SetAbility(ability);
        super.SetAbillityFunction(abilityFunction);
    
    } // constructor

    public Racoon() {
        super();
        super.SetName(names[randNum.nextInt(names.length)]);
        super.SetType(type);
        super.SetHealth(minHealth + randNum.nextInt(statBonus) + 1);
        super.SetStrength(minStrength + randNum.nextInt(statBonus) + 1);
        super.SetDexterity(minDexterity + randNum.nextInt(statBonus) + 1);
        super.SetArmour(armour);
        super.SetWeapon(weapon);
        super.SetAbility(ability);
        super.SetAbillityFunction(abilityFunction);
    
    } // 0 constructor

    @Override
    public void Ability() {
        super.damageMultiplier = 2;
    }
} // Raccon
