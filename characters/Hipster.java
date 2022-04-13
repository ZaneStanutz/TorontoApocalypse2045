
package characters;
import armour.*;
import weapon.*;

import armour.Armour;

public class Hipster extends Character {

    private String type = "Hipster";
    private String[] names = {"Elora", "Jeff", "Claire", "Miguel", "Alfonz"};
    private String ability = "Drink a craft beer";
    private String abilityFunction = "Heal";
    private int minHealth = 13;
    private int minStrength = 4;
    private int minDexterity = 7;
    private Armour armour = new SkinnyJeans();
    private Weapon weapon = new LimpWrists();
    
    public Hipster(String name) {
        super(name);
        super.SetType(type);
        super.SetHealth(minHealth + randNum.nextInt(statBonus) + 1);
        super.SetStrength(minStrength + randNum.nextInt(statBonus) + 1 );
        super.SetDexterity(minDexterity + randNum.nextInt(statBonus) + 1);
        super.SetArmour(armour);
        super.SetWeapon(weapon);
        super.SetAbility(ability);
        super.SetAbillityFunction(abilityFunction);
    } // constructor

    public Hipster() {
        super();
        super.SetName(names[randNum.nextInt(names.length)]);
        super.SetType(type);
        super.SetHealth(minHealth + randNum.nextInt(statBonus) + 1 );
        super.SetStrength(minStrength + randNum.nextInt(statBonus) + 1 );
        super.SetDexterity(minDexterity + randNum.nextInt(statBonus) + 1 );
        super.SetArmour(armour);
        super.SetWeapon(weapon);
        super.SetAbility(ability);
        super.SetAbillityFunction(abilityFunction);
    } // constructor
    
    @Override
    public void Ability(){
        super.health += randNum.nextInt(4) + 1;
    }
} // Hipster
    

