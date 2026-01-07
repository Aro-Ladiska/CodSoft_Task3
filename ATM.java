import java.util.*;
class BankAccount{
     int balance;
    void deposit(int amount){
        balance=balance+amount;
        System.out.println("Deposited : "+amount);
    }
    void withdraw(int amount){
        if(balance>=amount){
            balance=balance-amount;
            System.out.println("Withdrawn : "+amount);

        }
        else{
            System.out.println("Not enough money on account");
        }
    }
    void checkBalance(){
        System.out.println("Balance : "+balance);
    }

}




public class ATM {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BankAccount acc=new BankAccount();
        System.out.print("Enter balance : ");
        acc.balance=sc.nextInt();
        System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance");
        int choice;
        while(true){
        System.out.println("Choose option : ");
        choice=sc.nextInt();
        switch(choice){
            case 1:
            System.out.print("Enter amount : ");
            acc.deposit(sc.nextInt());
            break;

            case 2:
            System.out.println("Enter amount : ");
            acc.withdraw(sc.nextInt());
            break;

            case 3:
           acc.checkBalance();
           break;

           default:
            System.out.println("Invalid option entered");
            break;
        

    }
    
}
}
}