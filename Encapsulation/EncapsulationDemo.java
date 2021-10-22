package Encapsulation;

class Account {
    String name;
    double balance;
}


class AccountManager {
    Account account;
    AccountManager(Account account){
        this.account = account;
    }
    void setName(String name){
        this.account.name = name;
    }
    void getName(String name){
        System.out.println("name is "+this.account.name);
    }
    void setBalance(double balance){
        this.account.balance = balance;
    }
    void getBalance(double balance){
        System.out.println("balance is "+this.account.balance);
    }
    void printStatus(){
        System.out.println("Hello "+this.account.name+", Your account balance is "+this.account.balance);
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager(new Account());
        accountManager.setName("Sumanth");
        accountManager.setBalance(157000);

        accountManager.printStatus();
    }
}
