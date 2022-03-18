package zal.zaliczonko.Model;

import zal.zaliczonko.Model.Exceptions.NoMoneyEx;

public class BankAccount implements Account{

    public BankAccount(double balance, Owner owner) {
        this.balance = balance;
        this.owner = owner;
    }

    public double balance;
    public Owner owner;

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Wpłacono srodki na konto!");
    }

    public void withdraw(double amount) {
        if(balance - amount < 0){
            throw new NoMoneyEx(String.format("Nie masz wystarczająco środków na koncie."));
        }

        this.balance -= amount;

    }
}
