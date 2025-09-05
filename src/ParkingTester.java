public class ParkingTester {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();

        System.out.println(lot);

        Car carA = new Car("Infiniti", "Blue", true);

        lot.parkCar(carA);

        System.out.println(lot);

        Car carB = new Car("Cadillac", "Black", false);

        lot.parkCar(carB);

        System.out.println(lot);

        lot.unparkCar(0);

        System.out.println(lot);
    }
}
