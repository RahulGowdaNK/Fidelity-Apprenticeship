public class VEHICLEIHMAIN {
    public static void main(String[] args) {
        car Car = new car();
        car.startEngine();
        car.accelerate();

        MotorCycle motorcycle = new MotorCycle();
        motorcycle.startEngine();
        motorcycle.shiftgears();

        Truck truck = new Truck();
        truck.startEngine();
        truck.Load();
    }

    }

