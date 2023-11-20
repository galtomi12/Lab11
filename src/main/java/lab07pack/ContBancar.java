package lab07pack;

public class ContBancar {
    private int balance;

    public ContBancar(int balance) {
        this.balance=balance;
    }


    public void deposit(int amount){
        balance=balance+amount;
    }
    public void withdraw(int amount){
        if(balance-amount < 0)
            System.out.println("Nu se poate efectua tranzactia");
       else balance=balance-amount;
    }

    public int getBalance() {
        return balance;
    }
}
