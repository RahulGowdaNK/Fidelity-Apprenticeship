public class Lifeinsurance1 extends Insurance1{
    private float policyTerm;
    private float benefitPercentage;

    public Lifeinsurance1( String insurancenum,String insurancename, double amountcovered,float policyTerm, float benefitTerm) {
        super(insurancenum, insurancename, amountcovered);
        this.policyTerm = policyTerm;
        this.benefitPercentage = benefitPercentage;

    }
    public double calculatePremium() {
        double amountCovered= getamountCovered();
        return (amountCovered -(amountCovered*benefitPercentage/100))/policyTerm;
    }
}
