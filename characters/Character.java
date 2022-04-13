
package characters;
import java.util.Random;
import armour.*;
import weapon.*;

public abstract class Character {

    protected Random randNum = new Random();
    protected int statBonus = 3;
    protected int dexterity;
    protected int damageMultiplier = 1; // use special polymorphic method to modify this

    private String name;
    private String type;
    private String ability;
    private String abilityFunction;
    protected int health;
    protected int strength;

    public Armour armour; 
    public Weapon weapon;
    
    
    // constructors

    Character() {} //0 arg

    Character(String name) { // 1 arg
        this.name = name;
    }

    // getters

    public String GetName() {
        return this.name;
    }

    public String GetType() {
        return this.type;
    }

    public int GetHealth() {
        return this.health;
    }

    public int GetStrength() {
        return this.strength;
    }
    
    public int GetDexterity() {
        return this.dexterity;
    }
    
    public int ReturnStatBonus() {
        return this.statBonus;
    }
    
    public int GetDamageMultiplier() {
        return this.damageMultiplier;
    }
    
    public boolean IsDead() {
        boolean isDead = false;
        if(this.health <= 0)
            isDead = true;
        return isDead;
    }

    public String GetAbility() {
        return this.ability;
    }

    public String GetAbilityFunction() {
        return this.abilityFunction;
    }
        
    // setters

    public void SetHealth(int health) {
        this.health = health;
    }
    
    public void SetStrength(int strength) {
        this.strength = strength;
    }

    public void SetType(String type) {
        this.type = type;
    }

    public void SetName(String name) {
       this.name = name;
    }

    public void SetDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void SetStatBonus (int statBonus) {
        this.statBonus = statBonus;
    }

    public void SetArmour(Armour armour) {
        this.armour = armour;
    }
    
    public void SetWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void SetAbility(String ability) {
        this.ability = ability;
    }

    public void SetAbillityFunction(String abilityFunction) {
        this.abilityFunction = abilityFunction;
    }
 
        // mutator
    public void InflictDamage(int damage) {
        this.health -= damage;
    }

    // polymorphic method
    public abstract void Ability();
} // Character
