import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxRootTest{

    @Test
    public void testMaxRoot1() {
        SquareTrinomial st = new SquareTrinomial(1, -9, 20);
        MaxRoot obj = new MaxRoot(st);
        assertEquals(true, (Math.abs(obj.maxRoot()) - 5.0) < 1e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxRoot2() {
        SquareTrinomial st = new SquareTrinomial(1, 6, 14);
        MaxRoot obj = new MaxRoot(st);
        obj.maxRoot();
    }
}