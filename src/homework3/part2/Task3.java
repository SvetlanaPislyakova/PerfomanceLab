package homework3.part2;

import java.util.Random;
import java.util.Scanner;

/*
Проверить произведение элементов какой диагонали больше.
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер матрицы:");
        int size = scanner.nextInt();
        int res1 = 1, res2 = 1;
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
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) res1 *= matrix[i][j];
                if (i + j == size - 1) res2 *= matrix[i][j];
            }
        }
        if (res1 > res2) System.out.println("Произведение элементов главной диагонали больше");
        else if (res1 < res2) System.out.println("Произведение элементов побочной диагонали больше");
        else System.out.println("Произведения элементов главной и побочной диагоналей равны");
    }
}
