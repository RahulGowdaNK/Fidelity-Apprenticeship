public class Car extends Vehicle {
    private int NoDoor;

    public Car(String RegNo, String brand, int NoDoors){
        super(RegNo, brand);
        this.NoDoor = NoDoors;

    }
    public int getNoDoor(){
        return NoDoor;

    }
    public double CalculateParkingFee(){
        return 10.0;
    }
}
