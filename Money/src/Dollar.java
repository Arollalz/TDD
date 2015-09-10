/**
 * Created by zhenliu on 9/10/15.
 */
public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount,currency);
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public Dollar times(int multiplier){
        return Money.dollar(this.getAmount() * multiplier);
    }

    @Override
    public String currency() {
        return "USD";
    }
}
