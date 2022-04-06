import org.junit.Test;

import static org.junit.Assert.*;

public class IntegralFunctionalTest {

    LinearFunction f1 = new LinearFunction(1, 1, 10, 0);
    DivisionFunction f2 = new DivisionFunction(1, 1, 1, 1, 10, 0);

    @Test
    public void getResult1() {
        IntegralFunctional integralFunctional = new IntegralFunctional(10, 0);
        assertEquals(60, integralFunctional.getResult(f1), 0.0001);
    }

    @Test
    public void getResult2(){
        IntegralFunctional integralFunctional = new IntegralFunctional(10, 0);
        assertEquals(10, integralFunctional.getResult(f2), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getResult3() {
        IntegralFunctional integralFunctional = new IntegralFunctional(10, -4);
        integralFunctional.getResult(f1);
    }
}