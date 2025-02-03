public class Car {
    //strings as final because we don't want these to be changed
    private final String _make;
    private final String _color;
    private final boolean _handicap;

    public Car(String make, String color, boolean handicap) {
        _make = make;
        _color = color;
        _handicap = handicap;
    }

    public String getColor() {
        return _color;
    }

    public String getMake() {
        return _make;
    }

    public boolean getHandicap() {
        return _handicap;
    }
}
