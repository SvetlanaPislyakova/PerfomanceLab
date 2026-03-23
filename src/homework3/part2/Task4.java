package homework3.part2;

import java.util.Random;
import java.util.Scanner;

/*
Посчитать сумму четных элементов стоящих над побочной диагональю (не
включительно)
 */
public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер матрицы:");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        int sum = 0;
        boolean hasEven = false;
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
                if (i + j < size - 1 && matrix[i][j] % 2 == 0) {
                    sum += matrix[i][j];
                    hasEven = true;
                }
            }
        }
        if (hasEven) System.out.print("Сумма четных элементов над побочной диагональю: " + sum);
        else System.out.print("Над побочной диагональю нет четных элементов");
    }
}
