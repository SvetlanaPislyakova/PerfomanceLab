package homework7;

import java.util.Scanner;

import static homework7.GeneralMethods.inputString;
import static homework7.GeneralMethods.outputString;

/*
Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
меньше средней, а также их длину
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = {inputString(scanner), inputString(scanner), inputString(scanner)};
        double avg = 0;
        for (String s : strings) {
            avg += s.length();
        }
        avg /= strings.length;
        for (String s : strings) {
            if (s.length() < avg) {
                System.out.printf("=== Длина строки меньше %.2f ===%n", avg);
                outputString(s);
            }
        }
    }
}
