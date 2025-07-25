package practice_2;

public class BankAccount {
    String owner;
    double balance;

    //Конструктор
    BankAccount (String someOwner, double someBalance) {
        this.owner = someOwner;
        this.balance = someBalance;
    }

    String getOwner() {
        return this.owner;
    }

    double getBalance() {
        return this.balance;
    }

    void setOwner(String newOwner) {
        this.owner = newOwner;
    }

     double deposit(double amount) {
         return this.balance = this.balance + amount;
    }

    double withdraw(double amount) {
        return this.balance = this.balance - amount;
    }

    void printBalance() {
        System.out.println(owner + ", ваш баланс: " + balance);
    }
}
