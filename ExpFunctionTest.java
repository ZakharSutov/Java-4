import org.junit.Test;

import static org.junit.Assert.*;

public class ExpFunctionTest {

    @Test
    public void getValue() {
        ExpFunction expFunction = new ExpFunction(1, 0, 3, 1);
        assertTrue(expFunction.getValue(2) - 7.38 < 0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getValue1() {
        ExpFunction expFunction = new ExpFunction(1, 0, 5, 4);
        expFunction.getValue(2);
    }
}