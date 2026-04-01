package homework4.task1;

/*
Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке. Напишите
программу, которая создает три объекта класса CreditCard у которых заданы
номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и
снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
 */
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
