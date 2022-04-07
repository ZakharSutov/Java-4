import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinearFunctionTest {

    @Test
    public void getValue() {
        LinearFunction linearFunction = new LinearFunction(1, 2, 10, 1);
        assertEquals(4, linearFunction.getValue(2), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getValue1() {
        LinearFunction linearFunction = new LinearFunction(1, 1, 1, 0);
        linearFunction.getValue(2);
    }
}