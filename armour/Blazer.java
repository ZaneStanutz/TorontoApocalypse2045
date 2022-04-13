package armour;

public class Blazer extends Armour {
    
    private int damageReductionAmount = 1;
    private int weight = 2;
    String type = "Blazer";
    
    public Blazer() {
        super();
        super.SetDamageReductionAmount(damageReductionAmount); 
        super.SetWeightCostToDexterity(weight);
        super.SetType(type);
    }
} // Blazer
