import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhenliu on 9/10/15.
 */
public class FrancTest {
    @Test
    public void testFrancMultiplication()  {
        Franc five = Money.franc(5);

        assertEquals(five.times(2), Money.franc(10));
        assertEquals(five.times(3), Money.franc(15));
    }
}