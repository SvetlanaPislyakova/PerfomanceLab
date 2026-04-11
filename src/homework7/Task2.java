package homework7;

import java.util.Scanner;

import static homework7.GeneralMethods.inputString;
import static homework7.GeneralMethods.outputString;

/*
Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке
возрастания значений их длины.
 */
public class Task2 {

    private static void bubbleSort(String[] strings) {
        boolean isMove;
        do {
            isMove = false;
            for (int i = 0; i < strings.length - 1; i++) {
                if (strings[i].length() > strings[i + 1].length()) {
                    String temp = strings[i];
                    strings[i] = strings[i + 1];
                    strings[i + 1] = temp;
                    isMove = true;
                }
            }
        } while (isMove);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = {inputString(scanner), inputString(scanner), inputString(scanner)};
        bubbleSort(strings);
        for (String s : strings) {
            outputString(s);
        }
    }
}
