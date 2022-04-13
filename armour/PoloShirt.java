package armour;

public class PoloShirt extends Armour {
    
    private int damageReductionAmount = 1;
    private int weight = 1;
    private String type = "Polo Shirt";

    public PoloShirt() {
        super();
        super.SetDamageReductionAmount(damageReductionAmount);
        super.SetWeightCostToDexterity(weight);
        super.SetType(type);
    }
} // PoloShirt
