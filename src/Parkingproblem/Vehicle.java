public class Vehicle {
    private String RegNo;
    private String Brand;

    public Vehicle(String RegNo, String Brand) {

        this.RegNo = RegNo;
        this.Brand = Brand;
    }
    public String getRegNo() {
        return RegNo;

    }
    public String getBrand() {
        return Brand;
    }
    public double CalculateParkingFee(){
        return 0;
    }
}
