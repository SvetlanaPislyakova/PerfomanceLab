package homework3.part2;

import java.util.Scanner;

public class Task6 {

    private static void printBoard(char[][] matrix, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean checkResult(char[][] matrix, int size, char symbol) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (matrix[i][j] == matrix[i][j + 1] && matrix[i][j] == symbol) count++;
            }
            if (count == size - 1) return true;
            count = 0;
        }
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size - 1; i++) {
                if (matrix[i][j] == matrix[i + 1][j] && matrix[i][j] == symbol) count++;
            }
            if (count == size - 1) return true;
            count = 0;
        }
        for (int i = 0; i < size - 1; i++) {
            if (matrix[i][i] == matrix[i + 1][i + 1] && matrix[i][i] == symbol) count++;
        }
        if (count == size - 1) return true;
        count = 0;
        for (int i = 0; i < size - 1; i++) {
            if (matrix[size - 1 - i][i] == matrix[size - 2 - i][i + 1] && matrix[size - 1 - i][i] == symbol) count++;
        }
        return count == size - 1;
    }

    private static void nextStep(char[][] matrix, int size, char symbol, Scanner scanner) {
        int x, y;
        System.out.println(symbol + " - введите координаты клетки");
        while(true) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (x > size || y > size || matrix[x - 1][y - 1] == 'X' || matrix[x - 1][y - 1] == 'O') {
                System.out.println("Вы ввели некорректные координаты попробуйте еще раз");
                continue;
            }
            break;
        }
        matrix[x - 1][y - 1] = symbol;
    }

    private static boolean makeWinMove(char[][] matrix, int size, char symbol, Scanner scanner) {
        boolean isWin;
        nextStep(matrix, size, symbol, scanner);
        printBoard(matrix, size);
        isWin = checkResult(matrix, size, symbol);
        if (isWin) {
            System.out.println("Игра окончена!!! Победили " + symbol);
        }
        return isWin;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер игрового поля:");
        int size = scanner.nextInt();
        char[][] matrix = new char[size][size];
        int stepsCount = 0, maxSteps = size * size;
        printBoard(matrix, size);
        while (stepsCount < maxSteps) {
            if (makeWinMove(matrix, size, 'X', scanner)) return;
            stepsCount++;
            if (stepsCount == maxSteps) break;
            if (makeWinMove(matrix, size, 'O', scanner)) return;
            stepsCount++;
        }
        System.out.println("Ничья");
    }
}
