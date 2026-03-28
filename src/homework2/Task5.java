package homework2;

import java.util.Scanner;

/*
Напишите программу, где пользователь вводит любое целое положительное
число.
А программа суммирует все числа от 1 до введенного пользователем числа. Для
ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
пользователь не мог ввести некорректные данные
 */
public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        int a, result = 0;
        do {
            a = scanner.nextInt();
            if (a <= 0) System.out.println("Число должно быть больше нуля, попробуйте еще раз:");
        } while (a <= 0);
        for (int i = 1; i <= a; i++) {
            result += i;
        }
        System.out.println("Сумма чисел от 1 до " + a + " равна " + result);
    }
}
