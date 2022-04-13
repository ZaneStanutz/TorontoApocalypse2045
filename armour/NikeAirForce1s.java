package armour;

public class NikeAirForce1s extends Armour{

    private int damageReductionAmount = 1;
    private int weight = -1;  // makes you go fast
    private String type = "Nike AirForce 1s";

    public NikeAirForce1s() {
        super();
        super.SetWeightCostToDexterity(weight);
        super.SetDamageReductionAmount(damageReductionAmount);
        super.SetType(type);
    }
} // NikeAirForce1s
