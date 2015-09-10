/**
 * Created by zhenliu on 9/10/15.
 */
 public abstract class Money {
    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    protected static Dollar dollar(int amount){
        return new Dollar(amount);
    }

    protected static Franc franc(int amount){
        return new Franc(amount);
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
}
