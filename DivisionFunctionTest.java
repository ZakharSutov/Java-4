import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionFunctionTest {

    @Test
    public void getValue() {
        DivisionFunction divisionFunction = new DivisionFunction(10, 1, 1, 1, 10, 0);
        assertEquals(7, divisionFunction.getValue(2), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getValue1(){
        DivisionFunction divisionFunction = new DivisionFunction(2, 0, 1, 0, 1, 0);
        divisionFunction.getValue(2);
    }
}