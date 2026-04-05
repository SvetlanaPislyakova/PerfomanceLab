package homework7;

import java.util.Scanner;

import static homework7.GeneralMethods.inputString;
import static homework7.GeneralMethods.outputString;

/*
Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo"
 */
public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = inputString(scanner);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i)).append(str.charAt(i));
        }
        String newStr = sb.toString();
        outputString(newStr);
    }
}
