public class Parkinglot {
    public static void main(String[] args) {
        Car car = new Car("ABC123","TOYOTA",4);
        Motorcycle motorcycle= new Motorcycle("XYZ567","HARLEY","V-TWIN");
        System.out.println("Car (reg no:" +car.getRegNo() + "parking fee:"+car.CalculateParkingFee());
        System.out.println("motorcycle (reg no:"+motorcycle.getRegNo()+ "parking fee:"+motorcycle.CalculateParkingFee());
    }
}
