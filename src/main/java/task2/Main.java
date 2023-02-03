package task2;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1500);
        bankAccount.deposit(-100);
        bankAccount.drawlOfMoney(-100);
        bankAccount.drawlOfMoney(100);
        bankAccount.drawlOfMoney(1500);

    }
}
