import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by zhenliu on 9/10/15.
 */
public class testMultiplication {
    @Test
    public void testMultiplication() throws Exception {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.getAmount());
        product = five.times(3);
        assertEquals(15,product.getAmount());
    }
}
