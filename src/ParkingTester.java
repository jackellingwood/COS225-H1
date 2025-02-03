//TODO fill in with other classes
public class ParkingTester {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();

        System.out.println(lot.toString());

        Car carA = new Car("Infiniti", "Blue", true);

        lot.parkCar(carA);

        System.out.println(lot.toString());

        Car carB = new Car("Cadillac", "Black", false);

        lot.parkCar(carB);

        System.out.println(lot.toString());

        lot.unparkCar(0);

        System.out.println(lot.toString());
    }
}
