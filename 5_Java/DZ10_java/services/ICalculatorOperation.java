package services;

public interface ICalculatorOperation<T extends Number> {
    public Double operation(T n1, T n2) throws Exception;
}
