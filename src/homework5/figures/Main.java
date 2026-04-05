package homework5.figures;

/*
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
периметра(используя абстрактный класс/методы). Создать массив из 5 разных
фигур. Вывести на экран сумму периметра всех фигур в массиве
 */
public class Main {

    public static void main(String[] args) {
        Figure[] figures = {new Circle(2), new Rectangle(2, 3), new Triangle(3, 4, 5),
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
