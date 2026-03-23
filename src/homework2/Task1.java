package homework2;

import java.util.Scanner;

/*
Напишите программу, которая будет принимать на вход число из консоли и на
выход будет выводить сообщение четное число или нет. Для определения
четности числа используйте операцию получения остатка от деления (операция
выглядит так: '% 2').
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scanner.nextInt();
        if (a % 2 == 0) System.out.println("Число " + a + " четное");
        else System.out.println("Число " + a + " нечетное");
    }
}
