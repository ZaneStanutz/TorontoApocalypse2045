package armour;

public class Suit extends Armour {
    
    private int damageReductionAmount = 2;
    private int weight = 2;
    private String type = "Suit";

    public Suit() {
        super();
        super.SetDamageReductionAmount(damageReductionAmount);
        super.SetWeightCostToDexterity(weight);
        super.SetType(type);
    }
} // Suit
