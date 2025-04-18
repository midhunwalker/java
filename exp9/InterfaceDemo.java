import java.io.*;
interface VehicleInterface {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrake(int a);
}

class Bike implements VehicleInterface {
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void printState() {
        System.out.println("Bike state - Speed: " + speed + ", Gear: " + gear);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrake(3);
        System.out.println("Bike present state:");
        bike.printState();
    }
}
