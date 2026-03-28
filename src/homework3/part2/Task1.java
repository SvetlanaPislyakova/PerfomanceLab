package homework3.part2;

import java.util.Scanner;

/*
Посчитать сумму четных элементов стоящих на главной диагонали.
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы:");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        int sum = 0, count = 0;
        System.out.println("Введите значения элементов матрицы:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Вы ввели матрицу:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            if (matrix[i][i] % 2 == 0) {
                sum += matrix[i][i];
                count++;
            }
        }
        if (count != 0) {
            System.out.println("Сумма четных элементов главной диагонали матрицы равна: " + sum);
        } else {
            System.out.println("На главной диагонали матрицы нет четных элементов");
        }
    }
}
