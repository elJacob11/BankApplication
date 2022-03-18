package zal.zaliczonko.Model;

import zal.zaliczonko.Model.ObserverPattern.Observable;
import zal.zaliczonko.Model.ObserverPattern.ObserverOffice;

import java.util.ArrayList;

public class Bank implements Observable, BankingOperations {
    public ArrayList<BankAccount> accounts;
    private ArrayList<ObserverOffice> observers = new ArrayList<ObserverOffice>();

    public Bank() {
        this.accounts = new ArrayList<BankAccount>();
    }

    public void addObserverOffice(ObserverOffice observer) {
        this.observers.add(observer);
    }

    public void deleteObserverOffice(ObserverOffice observer) {
        this.observers.remove(observer);
    }

    public void notifyObserversOffices(BankAccount account, double amount) {
        for(ObserverOffice obs: this.observers){
            obs.update(account, amount);
        }
    }

    public void deposit(int nrAccount, double amount) {
        this.accounts.get(nrAccount).deposit(amount);
    }

    public void withdraw(int nrAccount, double amount) {
        this.accounts.get(nrAccount).withdraw(amount);
    }

    public void transfer(int nrAccountFrom, int nrAccountTo, double amount) {
        this.accounts.get(nrAccountFrom).withdraw(amount);
        this.accounts.get(nrAccountTo).deposit(amount);
    }
}