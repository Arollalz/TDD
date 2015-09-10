import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhenliu on 9/10/15.
 */
public class MoneyTest {
    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));

        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));

        assertFalse(Money.dollar(5).equals(Money.franc(5)));
    }

    @Test
    public void testCurrency() throws Exception {
        assertEquals(Money.dollar(1).currency(),"USD");
        assertEquals(Money.franc(1).currency(),"CHF");
    }
}