package armour;

public abstract class Armour {

    private int damageReductionAmount; // reduces incomming damage
    private int weightCostToDexterity; // reduces the p's dexterity
    private String type;

    public Armour() {}

    // getters
    public int GetDamageReductionAmount() {
        return this.damageReductionAmount;
    }
    
    public int weightCostToDexterity() {
        return this.weightCostToDexterity;
    }
    
    public String GetType(){
        return this.type;
    }
    
    // setters
    public void SetDamageReductionAmount(int damageReductionAmount) {
        this.damageReductionAmount = damageReductionAmount
        ;
    }

    public void SetWeightCostToDexterity(int weight) {
        this.weightCostToDexterity = weight;
    }
    public void SetType(String type) {
        this.type = type;
    }
} // Armour
