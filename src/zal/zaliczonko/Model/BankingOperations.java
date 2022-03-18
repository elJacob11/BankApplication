package zal.zaliczonko.Model;

public interface BankingOperations {
    public void deposit(int nrAccount, double amount);
    public void withdraw(int nrAccount, double amount);
    public void transfer(int nrAccountFrom, int nrAccountTo, double amount);

}
