package homework7;

import java.util.Scanner;

import static homework7.GeneralMethods.inputString;
import static homework7.GeneralMethods.outputString;

/*
Ввести 3 строки с консоли. Найти слово, состоящее только из различных
символов. Если таких слов несколько, найти первое из них.
 */
public class Task4 {

    private static boolean isUnique(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = {inputString(scanner), inputString(scanner), inputString(scanner)};
        for (String s : strings) {
            if (isUnique(s)) {
                outputString(s);
                return;
            }
        }
        System.out.println("Строк состоящих из уникальных символов не найдено");
    }
}
