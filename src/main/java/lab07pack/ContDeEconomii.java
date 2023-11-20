package lab07pack;

public class ContDeEconomii {
    private int balance;
    private int limit;

    public ContDeEconomii(int balance , int limit) {
        this.balance=balance;
        this.limit = limit;
    }

    public void withdraw(int amount){
        if(balance-amount <= limit)
            System.out.println("Nu se poate efectua tranzactia, deoarece depasiti limita");
        else balance=balance-amount;
    }
    public int getBalance(){
        return balance;
    }

}
