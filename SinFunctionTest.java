import org.junit.Test;

import static org.junit.Assert.*;

public class SinFunctionTest {

    @Test
    public void getValue() {
        SinFunction sinFunction = new SinFunction(0, 1, 1, 0);
        assertTrue(sinFunction.getValue(0.1) - 0.099 < 0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getValue1() {
        LinearFunction linearFunction = new LinearFunction(2, 5, 0, 1);
        linearFunction.getValue(101);
    }
}