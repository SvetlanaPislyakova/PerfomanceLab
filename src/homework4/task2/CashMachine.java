package homework4.task2;

import java.util.Scanner;

public class CashMachine {

    int twentyBillsCount;
    int fiftyBillsCount;
    int hundredBillsCount;

    public CashMachine(int twentyBillsCount, int fiftyBillsCount, int hundredBillsCount) {
        this.twentyBillsCount = twentyBillsCount;
        this.fiftyBillsCount = fiftyBillsCount;
        this.hundredBillsCount = hundredBillsCount;
    }

    public void addMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Внести в банкомат:");
        System.out.println("- купюр номиналом 100:");
        int hundredBillsAdded = scanner.nextInt();
        System.out.println("- купюр номиналом 50:");
        int fiftyBillsAdded = scanner.nextInt();
        System.out.println("- купюр номиналом 20:");
        int twentyBillsAdded = scanner.nextInt();
        if (hundredBillsAdded < 0 || fiftyBillsAdded < 0 || twentyBillsAdded < 0) {
            System.out.println("Количество купюр не может быть отрицательным");
            return;
        }
        twentyBillsCount += twentyBillsAdded;
        fiftyBillsCount += fiftyBillsAdded;
        hundredBillsCount += hundredBillsAdded;
    }

    public void printState() {
        System.out.println("В банкомате сейчас:");
        System.out.println("- купюр номиналом 100 - " + hundredBillsCount);
        System.out.println("- купюр номиналом 50 - " + fiftyBillsCount);
        System.out.println("- купюр номиналом 20 - " + twentyBillsCount);
    }


    public boolean getMoney(int sum) {
        int fiftiesDispensed = 0;
        int twentiesDispensed;
        int hundredsDispensed;
        int temp = sum;
        int totalAmount = twentyBillsCount * 20 + fiftyBillsCount * 50 + hundredBillsCount * 100;
        if (sum % 10 != 0 || (sum % 20 == 10 && (sum < 50 || fiftyBillsCount == 0)) || sum > totalAmount) {
            System.out.println("Невозможно выдать сумму: " + sum);
            return false;
        }
        if (temp % 20 == 10) {
            fiftiesDispensed = 1;
            temp -= 50;
        }
        hundredsDispensed = temp / 100;
        if (hundredsDispensed > hundredBillsCount) {
            hundredsDispensed = hundredBillsCount;
        }
        temp -= hundredsDispensed * 100;
        fiftiesDispensed += (temp / 100) * 2;
        if (fiftiesDispensed > fiftyBillsCount) {
            if (fiftiesDispensed % 2 != 0) {
                fiftiesDispensed = fiftyBillsCount % 2 != 0 ? fiftyBillsCount : fiftyBillsCount - 1;
            } else {
                fiftiesDispensed = fiftyBillsCount % 2 == 0 ? fiftyBillsCount : fiftyBillsCount - 1;
            }
        }
        temp -= fiftiesDispensed / 2 * 2 * 50;
        twentiesDispensed = temp / 20;
        temp -= twentiesDispensed * 20;
        if (twentiesDispensed > twentyBillsCount || temp != 0) {
            System.out.println("Невозможно выдать сумму: " + sum);
            return false;
        }
        hundredBillsCount -= hundredsDispensed;
        fiftyBillsCount -= fiftiesDispensed;
        twentyBillsCount -= twentiesDispensed;
        System.out.println("Выдано:");
        System.out.println("- купюр номиналом 100 - " + hundredsDispensed);
        System.out.println("- купюр номиналом 50 - " + fiftiesDispensed);
        System.out.println("- купюр номиналом 20 - " + twentiesDispensed);
        return true;
    }
}
