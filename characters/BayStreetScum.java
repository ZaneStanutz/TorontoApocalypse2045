package characters;

import armour.*;
import weapon.*;

public class BayStreetScum extends Character {
    
    private String type = "Bay Street Scum";
    private String[] names = {"Nigel","Reginald", "Xavier", "Bentley", "Tolliver", "Reuben"};
    private String ability = "I'll pay you 1000$ to eff off";
    private String abilityFunction = "Increase damage reduction";
    private int minHealth = 13;
    private int minStrength = 3;
    private int minDexterity = 5;
    private Armour armour = new Suit(); // setting static armour for character type
    private Weapon weapon = new Kick(); // seting static weapon for character type
    
    public BayStreetScum(String name) {
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

    public BayStreetScum() {
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
    
    } // 0 arg constructor
    
    @Override
    public void Ability() {
        armour.SetDamageReductionAmount(5);
    }
} // BayStreetScum


