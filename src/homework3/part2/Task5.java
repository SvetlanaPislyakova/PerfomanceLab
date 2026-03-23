package homework3.part2;

import java.util.Random;
import java.util.Scanner;

/*
Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
строкой и т. д.)
 */
public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер матрицы:");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        int[][] transpose = new int[size][size];
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
                transpose[i][j] = matrix[j][i];
            }
        }
        System.out.println("Транспонированная матрица:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
