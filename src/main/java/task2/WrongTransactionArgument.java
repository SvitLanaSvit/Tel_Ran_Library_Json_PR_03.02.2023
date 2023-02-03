package task2;

public class WrongTransactionArgument extends Exception{
    public WrongTransactionArgument(int money){
        super("Transaction is negative. Count of money for transaction is " + money);
    }
}
