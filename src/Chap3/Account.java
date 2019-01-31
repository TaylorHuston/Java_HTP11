package Chap3;

//Basic account class

public class Account {
    private String name;
    private double balance;

    public Account(String newName, double newBalance)  {
        this.name = newName;
        if (newBalance > 0.0) {
            this.balance = newBalance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0.0) {
            this.balance += amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }
}
