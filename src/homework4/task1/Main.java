package homework4.task1;

public class Main {

    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("47856669987412", 2300);
        CreditCard card2 = new CreditCard("57899513310222", 1200);
        CreditCard card3 = new CreditCard("22548736995412", 14500);
        card1.addMoneyToCard(700);
        card2.addMoneyToCard(1800);
        card3.getMoneyFromCard(11500);
        card1.printCardInfo();
        card2.printCardInfo();
        card3.printCardInfo();
    }
}
