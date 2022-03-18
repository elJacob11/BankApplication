package zal.zaliczonko.Model.ObserverPattern;

import zal.zaliczonko.Model.BankAccount;

public interface ObserverOffice {
    public void update(BankAccount bankAccount, double amount);
}
