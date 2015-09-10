/**
 * Created by zhenliu on 9/10/15.
 */
public class Franc extends Money {
    public Franc(int amount) {
        super(amount);
    }

    public int getAmount() {
        return amount;
    }

    public Franc times(int multiplier){
        return new Franc(this.getAmount() * multiplier);
    }
}

