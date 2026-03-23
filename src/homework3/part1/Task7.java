package homework3.part1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Имеется массив из неотрицательных чисел(любой). Представьте что массив
представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} - > 999). Задача
добавить единицу к этому “числу” и на выходе получить исправленный массив.
Массив не содержит нуля в начале, кроме самого числа 0.
 */
public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int res = 0, iter = 0, new_res;
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(0, 10);
        }
        for (int i = 0; i < size; i++) {
            res = res * 10 + numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        int[] temp = new int[size + 1];
        new_res = res + 1;
        do {
            temp[iter++] = new_res % 10;
            new_res /= 10;
        } while (new_res != 0);
        int[] new_arr = temp[size] == 0 ? new int[size] : new int[size + 1];
        for (int i = 0; i < new_arr.length; i++) {
            new_arr[i] = temp[new_arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(new_arr));
    }
}
