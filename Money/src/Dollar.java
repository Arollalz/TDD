/**
 * Created by zhenliu on 9/10/15.
 */
public class Dollar extends Money {
    public Dollar(int amount) {
        super(amount);
    }

    public int getAmount() {
        return amount;
    }

    public Dollar times(int multiplier){
        return new Dollar(this.getAmount() * multiplier);
    }
}
