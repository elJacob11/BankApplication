package zal.zaliczonko.Model.ObserverPattern;

import zal.zaliczonko.Model.BankAccount;

import java.util.ArrayList;

public interface Observable {
    public void addObserverOffice(ObserverOffice observer);
    public void deleteObserverOffice(ObserverOffice observer);
    public void notifyObserversOffices(BankAccount account, double amount);
}
