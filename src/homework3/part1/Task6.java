package homework3.part1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Проверить, является ли массив возрастающей последовательностью (каждое
следующее число больше предыдущего).
 */

public class Task6 {

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
        for (int i = 0; i < size - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                System.out.println("Массив не является возрастающей последовательностью");
                return;
            }
        }
        System.out.println("Массив является возрастающей последовательностью");
    }
}
