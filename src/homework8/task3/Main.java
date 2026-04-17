package homework8.task3;

import java.util.*;

/*
На вход поступает массив строк, верните Map<String, Boolean>, где каждая
отдельная строка является ключом, и ее значение равно true, если эта строка
встречается в массиве 2 или более раз.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Boolean> result = new LinkedHashMap<>();
        System.out.println("Введите строки через запятую:");
        String str = sc.nextLine();
        String[] parts = str.split(",");
        for (String part : parts) {
            String trimmed = part.trim();
            if(!trimmed.isEmpty()) {
                result.put(trimmed, result.containsKey(trimmed));
            }
        }
        System.out.println("Результат:");
        System.out.println(result);
    }
}
