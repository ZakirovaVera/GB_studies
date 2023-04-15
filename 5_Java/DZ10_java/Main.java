
import java.util.Arrays;


import services.ServiceCalculatorArray;

public class Main {
    public static void main(String[] args) throws Exception {

        ServiceCalculatorArray calc = new ServiceCalculatorArray<Double>();
        Integer[] a1 = new Integer[] { 0, 1, 3};
        Integer[] a2 = new Integer[] { 4 };
        double[] result = calc.summa(a1, a2);
        System.out.println(Arrays.toString(result));
    }
}
