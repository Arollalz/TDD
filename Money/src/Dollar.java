/**
 * Created by zhenliu on 9/10/15.
 */
public class Dollar extends Money {
    public Dollar(int amount) {
        this.setAmount(amount);
    }

    public Dollar times(int multiplier){
        return new Dollar(this.getAmount() * multiplier);
    }

    public int getAmount() {
        return amount;
    }
}
