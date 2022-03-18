package zal.zaliczonko.Model.Offices;

import zal.zaliczonko.Model.BankAccount;
import zal.zaliczonko.Model.ObserverPattern.ObserverOffice;

public class TaxOffice implements ObserverOffice {
    public void update(BankAccount bankAccount, double amount){
        System.out.println("update");
    }
}
