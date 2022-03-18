package zal.zaliczonko.Model;

public class SavingAccount extends BankAccount{
    public SavingAccount(double balance, Owner owner) {
        super(balance, owner);
    }
    public double interest;
    public void deposit(double amount) {
        super.deposit(amount);
    }

    public void withdraw(double amount) {
        super.withdraw(amount);
    }
}
