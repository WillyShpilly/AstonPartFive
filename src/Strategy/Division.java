package Strategy;

public class Division implements Operation{
    @Override
    public double execute (double a, double b) {
        if (b != 0) {
            return a/b;
        } else {
            throw new IllegalArgumentException("Не надо так");
        }
    }
}
