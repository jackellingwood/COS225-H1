public class ParkingSpot {
    private Car _car;
    private final boolean _handicap;

    public ParkingSpot(boolean handicap) {
        _handicap = handicap;
    }

    public Car getCar() {
        return _car;
    }

    public void setCar(Car car) {
        _car = car;
    }

    public boolean isHandicap() {
        return _handicap;
    }
}
