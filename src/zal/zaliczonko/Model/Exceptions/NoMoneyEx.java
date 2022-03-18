package zal.zaliczonko.Model.Exceptions;

public class NoMoneyEx extends RuntimeException {
    public NoMoneyEx(String noMoney)
    {
        this.noMoney = noMoney;
    }
    private String noMoney;

    public String getMessage()
    {
        return noMoney;
    }
}
