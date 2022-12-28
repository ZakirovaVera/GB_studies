package services;

import java.util.concurrent.Callable;

public class ServiceCalculator<T extends Number> {

    private Double n1 = 0d;
    private Double n2 = 0d;

    private void parseIntoToDouble(T num1, T num2) {

        if (num1 != null)
            n1 = num1.doubleValue();
            else n1 = 0d;
        if (num2 != null)
            n2 = num2.doubleValue();
            else n2 = 0d;
    }

    public double summa(T num1, T num2) {
        parseIntoToDouble(num1, num2);
        return n1 + n2;
    }

    public double subtraction(T num1, T num2) {
        parseIntoToDouble(num1, num2);
        return n1 - n2;
    }

    public double multiplication(T num1, T num2) {
        parseIntoToDouble(num1, num2);
        return n1 * n2;
    }

    public double division(T num1, T num2) throws Exception {
        parseIntoToDouble(num1, num2);
        if (n2 == 0) {
            throw new Exception("Второй аргумент равен 0");
        }
        return n1 / n2;
    }
}