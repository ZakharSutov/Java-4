import org.junit.Test;

import static org.junit.Assert.*;

public class SumFunctionalTest {

    LinearFunction f1 = new LinearFunction(1, 1, 10, 0);
    DivisionFunction f2 = new DivisionFunction(1, 1, 1, 1, 10, 0);

    @Test
    public void getResult1() {
        SumFunctional sumFunctional = new SumFunctional(10, 0);
        assertEquals(18, sumFunctional.getResult(f1), 0.0001);
    }

    @Test
    public void getResult2() {
        SumFunctional sumFunctional = new SumFunctional(10, 0);
        assertEquals(3, sumFunctional.getResult(f2), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getResult3() {
        SumFunctional sumFunctional = new SumFunctional(11, 0);
        sumFunctional.getResult(f1);
    }
}