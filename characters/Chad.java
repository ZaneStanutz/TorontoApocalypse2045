package characters;

import armour.*;
import weapon.*;

public class Chad extends Character {

    private String type = "Chad";
    private String[] names = {"Chad"};
    private String ability = "My dad is a lawyer";
    private String abilityFunction = "Increase damage";
    private int minHealth = 14;
    private int minStrength = 4;
    private int minDexterity = 6;
    private Armour armour = new PoloShirt();
    private Weapon weapon = new BaseballBat();
    
    
    public Chad(String name) {
        super(name);
        super.SetType(type);
        super.SetHealth(minHealth + randNum.nextInt(statBonus) );
        super.SetStrength(minStrength + randNum.nextInt(statBonus) );
        super.SetDexterity(minDexterity + randNum.nextInt(statBonus) ); 
        super.SetArmour(armour);
        super.SetWeapon(weapon);
        super.SetAbility(ability);
        super.SetAbillityFunction(abilityFunction);
    
    } // constructor

    public Chad() {
        super();
        super.SetName(names[0]);
        super.SetType(type);
        super.SetHealth(minHealth + randNum.nextInt(statBonus + 1));
        super.SetStrength(minStrength + randNum.nextInt(statBonus + 1));
        super.SetDexterity(minDexterity + randNum.nextInt(statBonus + 1));
        super.SetArmour(armour);
        super.SetWeapon(weapon);
        super.SetAbility(ability);
        super.SetAbillityFunction(abilityFunction);
    
    } // 0 arg constructor

    @Override
    public void Ability() {
        weapon.SetBaseDamage(9);
    }
} // Chad
