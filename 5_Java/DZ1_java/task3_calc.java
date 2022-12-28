import java.util.Scanner;

// 3. Реализовать простой калькулятор (пользователь вводит 2 числа и вводит операцию (+ - / *)

public class task3_calc {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = iScanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = iScanner.nextInt();
        System.out.print("Введите тип операции(+ - * /): ");
        String operationCalc = iScanner.next();
        float resultCalc = Calc(number1, number2, operationCalc);
        System.out.printf("%d %s %d = %.3f", number1, operationCalc, number2, resultCalc);
        iScanner.close();
    }
    public static float Calc(int num1, int num2, String oper) {
        float res = 0;
        switch(oper){
             
            case "+": 
                res = num1 + num2;
                break;
            case "-": 
                res = num1 - num2;
                break;
            case "*": 
                res = num1 * num2;
                break;
            case "/": 
                res = (float) num1 / (float) num2;
                break;
            default:
                System.out.println("Error");
        }
        return res;
    }
}
