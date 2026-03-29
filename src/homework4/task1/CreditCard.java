package homework4.task1;

public class CreditCard {

    String accountNumber;
    double currentSum;

    public CreditCard(String accountNumber, double currentSum) {
        this.accountNumber = accountNumber;
        this.currentSum = currentSum;
    }

    public void getMoneyFromCard(double sum) {
        currentSum -= sum;
    }

    public void addMoneyToCard(double sum) {
        currentSum += sum;
    }

    public void printCardInfo() {
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Остаток на карте: " + currentSum);
    }
}
