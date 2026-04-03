package homework5.figures;

public class Rectangle extends Figure {

    double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }

    @Override
    public double square() {
        return a * b;
    }
}
