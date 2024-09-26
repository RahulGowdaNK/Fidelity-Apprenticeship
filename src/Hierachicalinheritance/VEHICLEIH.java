public class VEHICLEIH {
    static void startEngine(){
        System.out.println("Engine started");

    }
}
class car extends VEHICLEIH{
    static void accelerate(){
        System.out.println("Accelerating");

    }
}
class MotorCycle extends VEHICLEIH{
    void shiftgears(){
        System.out.println("Shifting gears");
    }

}
class Truck extends VEHICLEIH{
    void Load(){
        System.out.println("Loading truck");
    }
}
