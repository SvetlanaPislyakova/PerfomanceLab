package homework7;

import java.util.Scanner;

public class GeneralMethods {

    protected static String inputString(Scanner scanner) {
        System.out.println("Введите строку: ");
        return scanner.nextLine();
    }

    protected static void outputString(String str) {
        System.out.printf("Строка: %s%n", str);
        System.out.printf("Длина строки: %d%n", str.length());
    }
}
