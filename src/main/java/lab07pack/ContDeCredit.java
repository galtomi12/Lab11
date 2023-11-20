package lab07pack;

public class ContDeCredit {
    private int credit;
    private int platalunara;

    public ContDeCredit(int credit , int platalunara) {
       this.credit = credit;
       this.platalunara = platalunara;
    }

    public void withdraw(int amount){
        if(amount > credit)
            platalunara = platalunara+amount-credit;
    }

    public int getPlatalunara(){
        return platalunara;
    }
}
