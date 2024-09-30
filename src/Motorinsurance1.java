public class Motorinsurance1 extends Insurance1{
    private float depreciationPercentage;

    public Motorinsurance1(float depreciationPercentage,String insurancenum,String insurancename,double amountCovered) {
        super(insurancenum,insurancename,amountCovered);
        this.depreciationPercentage = depreciationPercentage;

    }
    public double calculatePremium(){
        double amountCovered= getamountCovered();
        return amountCovered*(depreciationPercentage/100);

    }
}
