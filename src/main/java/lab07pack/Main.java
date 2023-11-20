package lab07pack;

import java.util.Scanner;


public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati suma initiala: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        ContBancar cont = new ContBancar(n);

        System.out.println("Deposit: ");
        n=scanner.nextInt();
        scanner.nextLine();
        cont.deposit(n);

        System.out.println("Balance: "+cont.getBalance());

        System.out.println("Withdraw: ");
        n=scanner.nextInt();
        scanner.nextLine();
        cont.withdraw(n);

        System.out.println("Balance: "+cont.getBalance());

        System.out.println("Dati suma initiala pentru contul de economii: ");
        n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Dati limita pentru contul de economii: ");
        int limit = scanner.nextInt();
        scanner.nextLine();
        ContDeEconomii conten = new ContDeEconomii(n,limit);

        System.out.println("Balance: "+conten.getBalance());
        System.out.println("Withdraw: ");
        n=scanner.nextInt();
        scanner.nextLine();
        conten.withdraw(n);
        System.out.println("Balance: "+conten.getBalance());



        System.out.println("Dati suma initiala pentru contul de credit: ");
        n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Dati plata lunara pentru contul de economii: ");
        int platalunara = scanner.nextInt();
        scanner.nextLine();
        ContDeCredit contcred = new ContDeCredit(n,platalunara);

        System.out.println("Plata Lunara: "+contcred.getPlatalunara());
        System.out.println("Withdraw: ");
        n=scanner.nextInt();
        scanner.nextLine();
        contcred.withdraw(n);
        System.out.println("Plata Lunara: "+contcred.getPlatalunara());


    }
}
