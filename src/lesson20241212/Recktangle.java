package lesson20241212;

public class Recktangle extends Figure {

    private double a;
    private double b;

    public Recktangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getSquare() {
        return a * b;
    }


    @Override
    public String toString() {
        return "Recktangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
