import java.util.Scanner;

// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class task1_product_sum_numbers {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int name = iScanner.nextInt();
        System.out.println(name +"-ое треугольное число = " + SumNumbers(name));
        System.out.printf("Произведение чисел от 1 до %d = " + ProductNumbers(name), name);
        iScanner.close();
    }
    public static int ProductNumbers(int n) {
            if (n == 1) return 1;
            else return n* ProductNumbers(n-1);
    }
    public static int SumNumbers(int n) {
            if (n == 1) return 1;
            else return n+ SumNumbers(n-1);
    }
}