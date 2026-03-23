package homework3.part1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Найти минимальный - максимальный элементы и вывести в консоль.
 */

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(numbers));
        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            if (max < number) max = number;
            if (min > number) min = number;
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}
