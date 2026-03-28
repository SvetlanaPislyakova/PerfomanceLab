package homework3.part1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Найти индексы минимального и максимального элементов и вывести в консоль.
 */
public class Task3 {

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
        int maxIdx = 0;
        int minIdx = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[maxIdx] < numbers[i]) maxIdx = i;
            if (numbers[minIdx] > numbers[i]) minIdx = i;
        }
        System.out.println("Индекс максимального элемента: " + maxIdx);
        System.out.println("Индекс минимального элемента: " + minIdx);
    }
}
