public class GenericNumeric<T extends Number> {

    private T value;

    public GenericNumeric(T value) {
        this.value = value;
    }

    // b) Reciprocal
    public double reciprocal() {
        return 1.0 / value.doubleValue();
    }

    // c) Fractional part
    public double fractionalPart() {
        return value.doubleValue() - Math.floor(value.doubleValue());
    }

    // d) Absolute value equality between two different numeric types
    public <U extends Number> boolean absoluteEquals(GenericNumeric<U> other) {
        return Math.abs(this.value.doubleValue()) == Math.abs(other.getValue().doubleValue());
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {

        // Test reciprocal and fractional part with Double
        GenericNumeric<Double> num = new GenericNumeric<>(9.76);
        System.out.println("Reciprocal: " + num.reciprocal());
        System.out.println("Fractional Part: " + num.fractionalPart());

        // Test absoluteEquals with Double and Float
        GenericNumeric<Double> d = new GenericNumeric<>(-7.0);
        GenericNumeric<Float>  f = new GenericNumeric<>(7.0f);
        System.out.println("Absolute Equals: " + d.absoluteEquals(f)); // true
    }
}