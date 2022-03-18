package zal.zaliczonko.Controller;

import zal.zaliczonko.Model.Bank;
import zal.zaliczonko.Model.BankAccount;
import zal.zaliczonko.Model.Owner;
import zal.zaliczonko.Model.SavingAccount;

public class BusinessLogic {
    public BusinessLogic(Bank bank) {
        this.bank = bank;
    }

    private Bank bank;

    public BankAccount addNewAccount(Owner owner){
        BankAccount account = new BankAccount(0, owner);
        this.bank.accounts.add(account);
        return account;
    }

    public BankAccount addNewSavingAccount(Owner owner){
        SavingAccount account = new SavingAccount(0, owner);
        this.bank.accounts.add(account);
        return account;
    }

    public void deposit(double amount, int nrAccount){
        this.bank.deposit(nrAccount, amount);
    }

    public void withdraw(double amount, int nrAccount){
        this.bank.withdraw(nrAccount, amount);
    }

    public void transfer(int nrAccountFrom, int nrAccountTo, double amount){
        this.bank.transfer(nrAccountFrom, nrAccountTo, amount);
    }
}
