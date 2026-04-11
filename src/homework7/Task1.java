package homework7;

import java.util.Scanner;

import static homework7.GeneralMethods.inputString;
import static homework7.GeneralMethods.outputString;

/*
Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
Вывести найденные строки и их длину.
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = {inputString(scanner), inputString(scanner), inputString(scanner)};
        String maxString = strings[0];
        String minString = strings[0];
        for (String s : strings) {
            if (s.length() > maxString.length()) maxString = s;
            if (s.length() < minString.length()) minString = s;
        }
        System.out.println("=== Самая длинная строка ===");
        outputString(maxString);
        System.out.println("=== Самая короткая строка ===");
        outputString(minString);
    }
}
