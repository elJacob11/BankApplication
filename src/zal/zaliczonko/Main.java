package zal.zaliczonko;

import zal.zaliczonko.Controller.BusinessLogic;
import zal.zaliczonko.Model.Bank;
import zal.zaliczonko.Model.BankAccount;
import zal.zaliczonko.Model.Owner;
import zal.zaliczonko.Model.SavingAccount;

public class Main {

    public static void main(String[] args) {
        BusinessLogic controller1 = new BusinessLogic(new Bank());
        Owner matusiak = new Owner("Jakub", "Matusiak");

        controller1.addNewAccount(matusiak);
        controller1.deposit(1000,668903);




    }
}
