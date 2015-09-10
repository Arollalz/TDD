/**
 * Created by zhenliu on 9/10/15.
 */
public class Franc extends Money {
    public Franc(int amount) {
        this.setAmount(amount);
    }

    public Franc times(int multiplier){
        return new Franc(this.getAmount() * multiplier);
    }

    public int getAmount() {
        return amount;
    }
}

