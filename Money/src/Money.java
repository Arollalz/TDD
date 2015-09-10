/**
 * Created by zhenliu on 9/10/15.
 */
public class Money {
    protected int amount;

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
}
