package test;

import org.junit.Assert;
import org.junit.Test;

import services.ServiceCalculator;

public class CalcTests {
    @Test
    public void testSumma() {
        ServiceCalculator calc = new ServiceCalculator<Double>();
        Double result = calc.summa(5, 2);
        Assert.assertTrue(result == 7);
    }

    @Test
    public void testSummaWithNull() {
        ServiceCalculator calc = new ServiceCalculator<Double>();
        Double result = calc.summa(5, null);
        Assert.assertTrue(result == 5);
        result = calc.summa(null, 8);
        Assert.assertTrue(result == 8);
        result = calc.summa(null, null);
        Assert.assertTrue(result == 0);
    }

    @Test
    public void testSubtraction() {
        ServiceCalculator calc = new ServiceCalculator<Double>();
        Double result = calc.subtraction(5, 2);
        Assert.assertTrue(result == 3);
    }

    @Test
    public void testSubtractionWithNull() {
        ServiceCalculator calc = new ServiceCalculator<Double>();
        Double result = calc.subtraction(5, null);
        Assert.assertTrue(result == 5);
        result = calc.subtraction(null, 8);
        Assert.assertTrue(result == -8);
        result = calc.subtraction(null, null);
        Assert.assertTrue(result == 0);
    }

    @Test
    public void testMultiplication() {
        ServiceCalculator calc = new ServiceCalculator<Double>();
        Double result = calc.multiplication(5, 2);
        Assert.assertTrue(result == 10);
    }

    @Test
    public void testMultiplicationWithNull() {
        ServiceCalculator calc = new ServiceCalculator<Double>();
        Double result = calc.multiplication(5, null);
        Assert.assertTrue(result == 0);
        result = calc.multiplication(null, 8);
        Assert.assertTrue(result == 0);
        result = calc.multiplication(null, null);
        Assert.assertTrue(result == 0);
    }

    @Test
    public void testDivision() throws Exception {
        ServiceCalculator calc = new ServiceCalculator<Double>();
        Double result = calc.division(5, 2);
        Assert.assertTrue(result == 2.5);
    }

    @Test
    public void testDivisionWithNull() throws Exception {
        ServiceCalculator calc = new ServiceCalculator<Double>();

        Double result = calc.division(null, 8);
        Assert.assertTrue(result == 0);

        Assert.assertThrows(
                Exception.class,
                () -> calc.division(5, null));
        Assert.assertThrows(
                Exception.class,
                () -> calc.division(null, null));
    }
}
