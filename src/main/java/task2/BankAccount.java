package task2;

public class BankAccount {

    private int countOfMoney;

    public BankAccount(int countOfMoney){
        this.countOfMoney = countOfMoney;
    }

    public void deposit(int money){
        if(money < 0){
            try {
                throw new WrongTransactionArgument(money);
            } catch (WrongTransactionArgument e) {
                System.out.println(e.getMessage());
            }
        }
        else{
            countOfMoney += money;
        }
    }

    public void drawlOfMoney(int money){
        if(money < 0){
            try{
                throw new WrongTransactionArgument(money);
            }catch (WrongTransactionArgument e){
                System.out.println(e.getMessage());
            }
        }
        else if(money > countOfMoney){
            try {
                throw new NotEnoughMoney(money, countOfMoney);
            } catch (NotEnoughMoney e) {
                System.out.println(e.getMessage());
            }
        }
        else{
            countOfMoney -= money;
        }
    }

    public int getCountOfMoney() {
        return countOfMoney;
    }
}
