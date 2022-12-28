package test;

import org.junit.Assert;
import org.junit.Test;

import services.ServiceCalculatorArray;

public class CalcArrayTest {

    @Test
    public void testSumma() throws Exception {
        ServiceCalculatorArray calc = new ServiceCalculatorArray<Double>();
        Integer[] a1 = new Integer[] { 0, 1};
        Integer[] a2 = new Integer[] { 4 };
        double[] result = calc.summa(a1, a2);
        Assert.assertTrue(result[0]==4);
        Assert.assertTrue(result[1]==1);
    }

    @Test
    public void testSubtraction() throws Exception {
        ServiceCalculatorArray calc = new ServiceCalculatorArray<Double>();
        Integer[] a1 = new Integer[] { 0, 1};
        Integer[] a2 = new Integer[] { 4 };
        double[] result = calc.subtraction(a1, a2);
        Assert.assertTrue(result[0]==-4);
        Assert.assertTrue(result[1]==1);
    }

    @Test
    public void testMultiplication() throws Exception {
        ServiceCalculatorArray calc = new ServiceCalculatorArray<Double>();
        Integer[] a1 = new Integer[] { 0, 1};
        Integer[] a2 = new Integer[] { 4 };
        double[] result = calc.multiplication(a1, a2);
        Assert.assertTrue(result[0]==0);
        Assert.assertTrue(result[1]==0);
    }

    @Test
    public void testDivision() throws Exception {
        ServiceCalculatorArray calc = new ServiceCalculatorArray<Double>();
        Integer[] a1 = new Integer[] { 4, 2};
        Integer[] a2 = new Integer[] { 4, 1};
        double[] result = calc.division(a1, a2);
        Assert.assertTrue(result[0]==1);
        Assert.assertTrue(result[1]==2);
    }

    @Test
    public void testDivisionThrow() throws Exception {
        ServiceCalculatorArray calc = new ServiceCalculatorArray<Double>();
        Integer[] a1 = new Integer[] { 4, 2};
        Integer[] a2 = new Integer[] {0};

        Assert.assertThrows(
                Exception.class,
                () -> calc.division(a1, a2));
    }
}
