package homework3.part1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Пройти по массиву и поменять местами элементы первый и последний, второй
и предпоследний и т.д.
 */
public class Task5 {

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
        int temp;
        for (int i = 0; i < size / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[size - 1 - i];
            numbers[size - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
