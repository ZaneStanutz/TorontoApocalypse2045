package armour;

public class SkinnyJeans extends Armour {

    private int damageReductionAmount = 1;
    private int weight = 0;
    private String type = "Skinny Jeans";

    public SkinnyJeans() {
        super();
        super.SetDamageReductionAmount(damageReductionAmount);
        super.SetWeightCostToDexterity(weight);
        super.SetType(type);
    }
} // SkinnyJeans
