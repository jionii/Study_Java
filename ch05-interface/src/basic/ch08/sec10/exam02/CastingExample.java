package basic.ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        ((Bus) vehicle).checkFare();

        Bus bus = new Bus();
        bus.run();
        bus.checkFare();
    }
}
