
package characters;
import weapon.*;
import armour.*;

public class Karen extends Character {
    
    private String type = "Karen";
    private String[] names = {"Karen"};
    private String ability = "I'm calling the cops";
    private String abilityFunction = "Increase strength";
    private int minHealth = 15;
    private int minStrength = 3;
    private int minDexterity = 6;
    private Weapon weapon = new PepperSpray(); 
    private Armour armour = new Blazer();
    
    
    public Karen(String name) { 
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

    public Karen() {  
        super();
        super.SetName(names[0]);
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
        SetStrength(strength += randNum.nextInt(3) + 1);
    }
} // Karen
