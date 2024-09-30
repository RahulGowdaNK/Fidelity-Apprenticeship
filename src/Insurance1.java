public class Insurance1 {
    private String insurancenum;
    private String insurancename;
    private double amountCovered;


    public Insurance1 (String insurancenum, String insurancename,  double amountCovered) {
        this.insurancenum = insurancenum;
        this.insurancename = insurancename;
        this.amountCovered = amountCovered;
    }

    public String getinsutancenum() {
        return insurancenum;
    }
    public String getinsurancename() {
        return insurancename;
    }
    public double getamountCovered() {
        return amountCovered;

    }
    public double claculatePremium(){
        return amountCovered*0.05;
    }
}
