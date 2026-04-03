package homework5.figures;

public class Main {

    public static void main(String[] args) {
        Figure [] figures = {new Circle(2), new Rectangle(2, 3), new Triangle(1, 2, 3),
                new Circle(3), new Rectangle(4, 2)};
        double sumPerimeters = 0;
        double sumSquares = 0;
        for (Figure figure : figures) {
            sumPerimeters += figure.perimeter();
            sumSquares += figure.square();
        }
        System.out.println("Сумма периметров всех фигур = " + sumPerimeters);
        System.out.println("Сумма площадей всех фигур = " + sumSquares);
    }
}
