/**
 * Created by zhenliu on 9/10/15.
 */
 public abstract class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    protected static Dollar dollar(int amount){
        return new Dollar(amount, "USD");
    }

    protected static Franc franc(int amount){
        return new Franc(amount, "CHF");
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return this.getAmount() == money.getAmount()
               && this.getClass().equals(money.getClass()) ;
    }

    abstract Money times(int multiplier);

    abstract String currency();
}
