import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SquareTrinomialTest {

    @Test
    public void testAnswer1() {
        SquareTrinomial exm = new SquareTrinomial(1, 5, 4);
        double[] arrTest = new double[]{-1, -4};
        double[] arr = exm.answer();
        Assert.assertTrue(Arrays.equals(arrTest, arr));
    }

    @Test
    public void testAnswer2() {
        SquareTrinomial exm = new SquareTrinomial(1, 4, 4);
        double[] arrTest = new double[]{-2};
        double[] arr = exm.answer();
        Assert.assertTrue(Arrays.equals(arrTest, arr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAnswer3() {
        SquareTrinomial exm = new SquareTrinomial(1, 4, 49);
        double[] arr = exm.answer();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAnswer4() {
        SquareTrinomial exm = new SquareTrinomial(0, 5, 10);
        double[] arr = exm.answer();
    }

    @Test
    public void testAnswer5() {
        SquareTrinomial exm = new SquareTrinomial(2, 0, -32);
        double[] arrTest = new double[]{4, -4};
        double[] arr = exm.answer();
        Assert.assertTrue(Arrays.equals(arrTest, arr));
    }
}