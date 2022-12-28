package services;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.function.Function;

public class ServiceCalculatorArray<T extends Number> {

    private ServiceCalculator calculator = new ServiceCalculator<T>();
    private ArrayList<Double> resultList = new ArrayList<>();

    public double[] summa(T[] num1, T[] num2) throws Exception {
        operation(num1, num2, calculator::summa);
        return resultList.stream().mapToDouble(i -> i).toArray();
    }

    public double[] subtraction(T[] num1, T[] num2) throws Exception {
        operation(num1, num2, calculator::subtraction);
        return resultList.stream().mapToDouble(i -> i).toArray();
    }

    public double[] multiplication(T[] num1, T[] num2) throws Exception {
        operation(num1, num2, calculator::multiplication);
        return resultList.stream().mapToDouble(i -> i).toArray();
    }

    public double[] division(T[] num1, T[] num2) throws Exception {
        operation(num1, num2, calculator::division);
        return resultList.stream().mapToDouble(i -> i).toArray();
    }

    private void operation(T[] array1, T[] array2, ICalculatorOperation<T> calcOperation) throws Exception {
        if (array1.length >= array2.length)
            for (int i = 0; i < array1.length; i++) {
                T n1 = getElement(i, array1);
                T n2 = getElement(i, array2);
                Double result = calcOperation.operation(n1, n2);
                resultList.add(result);
            }
        if (array1.length < array2.length)
            for (int i = 0; i < array2.length; i++) {
                T n1 = getElement(i, array1);
                T n2 = getElement(i, array2);
                Double result = calcOperation.operation(n1, n2);
                resultList.add(result);
            }
    }

    private T getElement(int index, T[] array) {
        if(index > array.length -1){
            return null;
        }
        return array[index];
    }
}
