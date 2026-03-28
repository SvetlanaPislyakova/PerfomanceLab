package homework3.part1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(-100, 100);
        }
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
