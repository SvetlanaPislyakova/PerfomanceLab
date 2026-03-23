package homework3.part1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
вывести сообщение, что их нет.
 */
public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(-10, 10);
        }
        System.out.println(Arrays.toString(numbers));
        int count = 0;
        for (int number : numbers) {
            if (number == 0) count++;
        }
        if (count == 0) System.out.println("Нулевых элементов не найдено");
        else System.out.println("Количество нулевых элементов: " + count);
    }
}
