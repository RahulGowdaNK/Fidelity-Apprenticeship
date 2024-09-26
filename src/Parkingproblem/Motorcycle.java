public class Motorcycle extends Vehicle {
    private String Engine;

    public Motorcycle(String RegNO,String Brand,String Engine){
        super(RegNO,Brand);
        this.Engine=Engine;

    }
    public String getEngine() {
        return Engine;

    }
    public double CalculateParkingFee(){
        return 5.0;
    }
}
