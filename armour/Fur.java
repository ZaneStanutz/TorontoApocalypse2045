package armour;

public class Fur extends Armour{
    
    private int damageReductionAmount = 1;
    private int weight = 0;
    private String type = "Fur";

    public Fur() {
        super();
        super.SetDamageReductionAmount(damageReductionAmount);
        super.SetWeightCostToDexterity(weight);
        super.SetType(type);
    }
} // Fur
