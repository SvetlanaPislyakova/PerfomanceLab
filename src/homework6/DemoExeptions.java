package homework6;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class DemoExeptions {

    public void divide(int a, int b) throws Exception {
        try {
            System.out.println(a + " / " + b + " = " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя " + e.getMessage());
        }
    }

    public int[] addArray(int size) throws Exception {
        Random random = new Random();
        try {
            int[] numbers = new int[size];
            for (int i = 0; i < size; i++) {
                numbers[i] = random.nextInt(-10, 10);
            }
            return numbers;
        } catch (NegativeArraySizeException e) {
            throw new Exception("Размер массива не может быть отрицательным " + e.getMessage());
        }
    }

    public void getElement(int[] array, int index) {
        try {
            System.out.println("Элемент с индексом " + index + " - " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс за пределами массива - " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Массива нет - " + e.getMessage());
        }
    }

    public void parseInt(String str) {
        try {
            if (!str.isEmpty()) System.out.println("Это число - " + Integer.parseInt(str));
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Произошла ошибка - " + e);
        }
    }

    public void printNumber() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите число:");
            int num = sc.nextInt();
            System.out.println("Вы ввели - " + num);
        } catch (InputMismatchException e) {
            System.out.println("Это не число - " + e.getMessage());
        } finally {
            System.out.println("В любом случае продолжим");
        }
    }
}
