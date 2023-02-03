package task2;

public class NotEnoughMoney extends Exception{
    public NotEnoughMoney(int value, int countOfMoney){
        super("There are not enough money after removal. You will drawl " + value + ". On account: " + countOfMoney +
                "(Rest: " + (countOfMoney - value) + ")");
    }
}
