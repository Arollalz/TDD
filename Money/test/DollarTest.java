import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by zhenliu on 9/10/15.
 */
public class DollarTest {
    @Test
    public void testMultiplication()  {
        Dollar five = Money.dollar(5);

        assertEquals(five.times(2), Money.dollar(10));
        assertEquals(five.times(3), Money.dollar(15));
    }
}
