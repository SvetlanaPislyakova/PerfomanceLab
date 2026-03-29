package homework4.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CashMachine cashMachine = new CashMachine(10, 1, 1);
        boolean canDispenseAmount;
        int action;
        while (true) {
            System.out.println("\n=== Что будем делать? ===");
            System.out.println("1 - Пополним банкомат");
            System.out.println("2 - Снимем наличные");
            System.out.println("3 - Проверим остаток в банкомате");
            System.out.println("4 - Выход");
            action = scanner.nextInt();
            switch (action) {
                case 1:
                    cashMachine.addMoney();
                    break;
                case 2:
                    System.out.println("Введите сумму, которую хотите снять:");
                    do {
                        int sum = scanner.nextInt();
                        canDispenseAmount = cashMachine.getMoney(sum);
                        if (!canDispenseAmount) System.out.println("Введите другую сумму:");
                    } while (!canDispenseAmount);
                    break;
                case 3:
                    cashMachine.printState();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Вы ввели некорректное значение");
            }
        }
    }
}
