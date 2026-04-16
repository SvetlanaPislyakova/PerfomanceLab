package homework8.task1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
Пользователь вводит набор чисел в виде одной строки с клавиатуры.
Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
Вывести результат на экран.
При решении использовать коллекции.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа через запятую:");
        String str = sc.nextLine();
        String[] parts = str.split(",");
        Set<Integer> unique = new LinkedHashSet<>();
        for (String part : parts) {
            String trimmed = part.trim();
            if(!trimmed.isEmpty()) {
                try {
                    unique.add(Integer.parseInt(trimmed));
                } catch (NumberFormatException e) {
                    System.out.printf("Введено не число %s", trimmed);
                    return;
                }
            }
        }
        System.out.println(unique);
    }
}
