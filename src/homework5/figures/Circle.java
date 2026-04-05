package homework5.figures;

public class Circle extends Figure {

    double d;

    public Circle(double d) {
        this.d = d;
    }

    @Override
    public double perimeter() {
        return Math.PI * d;
    }

    @Override
    public double square() {
        return (Math.PI * Math.pow(d, 2)) / 4;
    }
}
