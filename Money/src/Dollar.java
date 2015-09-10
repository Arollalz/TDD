/**
 * Created by zhenliu on 9/10/15.
 */
public class Dollar {
    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

    public int getAmount() {
        return amount;
    }
}
