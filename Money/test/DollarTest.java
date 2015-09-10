import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by zhenliu on 9/10/15.
 */
public class DollarTest {
    @Test
    public void testMultiplication()  {
        Dollar five = new Dollar(5);

        assertEquals(five.times(2), new Dollar(10));
        assertEquals(five.times(3), new Dollar(15));
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
