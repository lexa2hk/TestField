package Task24;

public class DigitFabric {
    public static Digit createDigit(digitType type, int value) {
        switch (type) {
            case COMPLEX:
                return new ComplexDigit(value);
            case REAL:
                return new RealDigit(value);
            default:
                throw new IllegalArgumentException("Unknown digit type");
        }

    }
}
