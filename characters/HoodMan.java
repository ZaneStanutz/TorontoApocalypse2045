
package characters;
import armour.*;
import weapon.*;

public class HoodMan extends Character {
    
    private String type = "Hoodman";
    private String[] names = {"Lil Hugo","LeftEye", "Wallace", "Tamir", "Paolo", "Smiley"};
    private String ability = "Activate quick reflex";
    private String abilityFunction = "Increase dexterity";
    private int minHealth = 12;
    private int minStrength = 4;
    private int minDexterity = 5;
    private Armour armour = new NikeAirForce1s();
    private Weapon weapon = new Hands();
    
    public HoodMan(String name) {
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

    public HoodMan() {
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
    } // constructor

    @Override
    public void Ability() {
        super.dexterity += randNum.nextInt(3) + 1; 
    }
} // HoodMan
