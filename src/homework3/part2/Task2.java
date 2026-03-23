package homework3.part2;

import java.util.Random;
import java.util.Scanner;

/*
Вывести нечетные элементы находящиеся под главной диагональю
(включительно).
 */
public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер матрицы:");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(0, 50);
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Нечетные элементы: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i >= j && matrix[i][j] % 2 != 0)
                    System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
