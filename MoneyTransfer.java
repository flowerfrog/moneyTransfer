public class MoneyTransfer {
    public static void main(String[] args) {
        int currentBalance = 2_000_000_000;
        System.out.println("Текущий балас: " + currentBalance);
        int transferAmount = 500_000_000;
        System.out.println("Сумма перевода: " + transferAmount);
        int totalSum = currentBalance + transferAmount;
        System.out.println("Итоговый баланс: " + totalSum);
    }
}
