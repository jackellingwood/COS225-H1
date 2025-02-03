public class ParkingLot {
    private final ParkingSpot[] _spots; // final because vscode told me so

    public ParkingLot() {
        _spots = new ParkingSpot[8];
        for (int i = 0; i < 8; i++) {
            _spots[i] = new ParkingSpot(i < 2); // the first two parking spots are handicap
        }
    }

    public int parkCar(Car car) {
        for (int i = 0; i < 8; i++) {
            // the following statement checks if the spot is empty AND follows the rule (non-handicap cars cannot park in handicap spots)
            if ((_spots[i].getCar() == null) && (!_spots[i].isHandicap() || car.isHandicap())) {
                _spots[i].setCar(car);
                return i;
            }
        }
        return -1;
    }

    public Car unparkCar(int index) {
        Car car = _spots[index].getCar(); // no pop method? seriously?
        _spots[index].setCar(null);
        return car;
    }

    @Override
    public String toString() {
        int numHandicap = 0;
        int numNonHandicap = 0;
        for (int i = 0; i < 8; i++) {
            if (_spots[i].getCar() == null) {
                if (_spots[i].isHandicap()) {
                    numHandicap++;
                } else {
                    numNonHandicap++;
                }
            }
        }
        return "" + numHandicap + " " + numNonHandicap;
    }
}
