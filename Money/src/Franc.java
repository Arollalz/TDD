/**
 * Created by zhenliu on 9/10/15.
 */
public class Franc extends Money {
    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public Franc times(int multiplier){
        return Money.franc(this.getAmount() * multiplier);
    }

    @Override
    public String currency() {
        return "CHF";
    }
}

